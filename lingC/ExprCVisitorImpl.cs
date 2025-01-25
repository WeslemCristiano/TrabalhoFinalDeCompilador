using System;
using System.Collections.Generic;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        // Dicionário para armazenar variáveis e seus valores
        private Dictionary<string, object?> memory = new Dictionary<string, object?>();

        // Dicionário para armazenar funções e seus contextos
        private Dictionary<string, ExprCParser.FunctionDeclarationContext> functions = new Dictionary<string, ExprCParser.FunctionDeclarationContext>();

        // Visitando declarações de funções
        public override object? VisitFunctionDeclaration(ExprCParser.FunctionDeclarationContext context)
        {
            string functionName = context.IDENTIFIER().GetText();
            functions[functionName] = context;
            // Console.WriteLine($"Função '{functionName}' declarada."); // Para depuração
            return null;
        }

        // Visitando chamadas de funções
        public override object? VisitChamadaStatement(ExprCParser.ChamadaStatementContext context)
        {
            string functionName = context.IDENTIFIER().GetText();

            if (!functions.ContainsKey(functionName))
            {
                throw new Exception($"Error: Function '{functionName}' undeclared.");
            }

            ExprCParser.FunctionDeclarationContext functionContext = functions[functionName];
            ExprCParser.ParameterListContext? parameterList = functionContext.parameterList();
            var arguments = context.expression();

            // Verificar se o número de argumentos corresponde ao número de parâmetros
            if (parameterList != null && parameterList.parameter().Length != arguments.Length)
            {
                throw new Exception($"Error: Incorrect number of arguments for function'{functionName}'.");
            }

            // Salvar o estado atual da memória
            var previousMemory = new Dictionary<string, object?>(memory);

            // Atribuir valores dos argumentos aos parâmetros
            if (parameterList != null)
            {
                for (int i = 0; i < parameterList.parameter().Length; i++)
                {
                    string paramName = parameterList.parameter(i).IDENTIFIER().GetText();
                    object? argValue = Visit(arguments[i]);
                    memory[paramName] = argValue;
                }
            }

            // Executar o corpo da função
            object? result = Visit(functionContext.block());

            // Restaurar o estado anterior da memória
            memory = previousMemory;

            return result;
        }

        // Método para executar a função main
        public void ExecuteMainFunction()
        {
            if (functions.ContainsKey("main"))
            {
                Visit(functions["main"].block());
            }
            else
            {
                throw new Exception("Error: Function 'main' not declared.");
            }
        }

        // Visitando declarações de variáveis
        public override object? VisitVariableDeclaration(ExprCParser.VariableDeclarationContext context)
        {
            foreach (var declarator in context.variableDeclarator())
            {
                string varName = declarator.IDENTIFIER().GetText();

                if (declarator.expression() != null)
                {
                    // Avalia a expressão do lado direito da atribuição
                    object? value = Visit(declarator.expression());
                    memory[varName] = value;
                    //Console.WriteLine($"Variável '{varName}' inicializada com valor: {value}"); // Para depuração
                }
                else
                {
                    memory[varName] = null;
                    //Console.WriteLine($"Variável '{varName}' declarada sem inicialização."); // Para depuração
                }
            }

            return null;
        }

       // Visitando expressões aritméticas (adição e subtração)
        public override object? VisitAdditiveExpression(ExprCParser.AdditiveExpressionContext context)
        {
            object? result = Visit(context.multiplicativeExpression(0));

            for (int i = 1; i < context.multiplicativeExpression().Length; i++)
            {
                object? right = Visit(context.multiplicativeExpression(i));
                if (context.GetChild(2 * i - 1).GetText() == "+")
                {
                    result = Convert.ToDouble(result) + Convert.ToDouble(right);
                }
                else if (context.GetChild(2 * i - 1).GetText() == "-")
                {
                    result = Convert.ToDouble(result) - Convert.ToDouble(right);
                }
            }

            return result;
        }

        // Declaração de expressão matemática (multiplicação, divisão e módulo)
        public override object? VisitMultiplicativeExpression(ExprCParser.MultiplicativeExpressionContext context)
        {
            object? result = Visit(context.unaryExpression(0));

            for (int i = 1; i < context.unaryExpression().Length; i++)
            {
                object? right = Visit(context.unaryExpression(i));
                if (context.GetChild(2 * i - 1).GetText() == "*")
                {
                    result = Convert.ToDouble(result) * Convert.ToDouble(right);
                }
                else if (context.GetChild(2 * i - 1).GetText() == "/")
                {
                    result = Convert.ToDouble(result) / Convert.ToDouble(right);
                }
                else if (context.GetChild(2 * i - 1).GetText() == "%")
                {
                    result = Convert.ToDouble(result) % Convert.ToDouble(right);
                }
            }

            return result;
        }

        // Declaração de expressão unária
        public override object? VisitUnaryExpression(ExprCParser.UnaryExpressionContext context)
        {
            object? value = Visit(context.primaryExpression());

            if (context.GetChild(0) != null)
            {
                string operatorText = context.GetChild(0).GetText();
                if (operatorText == "-")
                {
                    return -Convert.ToDouble(value);
                }
                else if (operatorText == "!")
                {
                    return !Convert.ToBoolean(value);
                }
                else if (operatorText == "++")
                {
                    if (value is double)
                    {
                        return (double)value + 1;
                    }
                    else if (value is int)
                    {
                        return (int)value + 1;
                    }
                }
                else if (operatorText == "--")
                {
                    if (value is double)
                    {
                        return (double)value - 1;
                    }
                    else if (value is int)
                    {
                        return (int)value - 1;
                    }
                }
            }

            return value;
        }

        

       // Visitando constantes (números inteiros e floats) dentro da expressão primária
        public override object? VisitPrimaryExpression(ExprCParser.PrimaryExpressionContext context)
        {
            if (context.CONSTANT() != null)
            {
                // Parseia o token CONSTANT como número
                return double.Parse(context.CONSTANT().GetText());
            }
            else if (context.IDENTIFIER() != null)
            {
                string varName = context.IDENTIFIER().GetText();

                if (memory.ContainsKey(varName))
                {
                    return memory[varName];
                }
                else
                {
                    throw new Exception($"Error: Variable '{varName}' undeclared.");
                }
            }
            else if (context.STRING_LITERAL() != null)
            {
                // Retorna o literal de string sem as aspas
                return context.STRING_LITERAL().GetText().Trim('"');
            }
            else
            {
                // Caso seja uma expressão entre parênteses
                return Visit(context.expression());
            }
        } 

        // Declaração de expressão lógica (ou)
        public override object? VisitLogicalOrExpression(ExprCParser.LogicalOrExpressionContext context)
        {
            object? left = Visit(context.logicalAndExpression(0));
            object? right = context.logicalAndExpression().Length > 1 ? Visit(context.logicalAndExpression(1)) : false;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "||")
            {
                return Convert.ToBoolean(left) || Convert.ToBoolean(right);
            }

            return base.VisitLogicalOrExpression(context);
        }

        // Declaração de expressão lógica (e)
        public override object? VisitLogicalAndExpression(ExprCParser.LogicalAndExpressionContext context)
        {
            object? left = Visit(context.equalityExpression(0));
            object? right = context.equalityExpression().Length > 1 ? Visit(context.equalityExpression(1)) : false;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "&&")
            {
                return Convert.ToBoolean(left) && Convert.ToBoolean(right);
            }

            return base.VisitLogicalAndExpression(context);
        }

        // Declaração de expressão lógica (igualdade e diferença)
        public override object? VisitEqualityExpression(ExprCParser.EqualityExpressionContext context)
        {
            object? left = Visit(context.relationalExpression(0));
            object? right = context.relationalExpression().Length > 1 ? Visit(context.relationalExpression(1)) : false;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "==")
            {
                return left.Equals(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == "!=")
            {
                return !left.Equals(right);
            }

            return base.VisitEqualityExpression(context);
        }

        // Declaração de expressão relacional (menor, menor ou igual, maior e maior ou igual)
        public override object? VisitRelationalExpression(ExprCParser.RelationalExpressionContext context)
        {
            object? left = Visit(context.additiveExpression(0));
            object? right = context.additiveExpression().Length > 1 ? Visit(context.additiveExpression(1)) : false;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "<")
            {
                return Convert.ToDouble(left) < Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == "<=")
            {
                return Convert.ToDouble(left) <= Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == ">")
            {
                return Convert.ToDouble(left) > Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == ">=")
            {
                return Convert.ToDouble(left) >= Convert.ToDouble(right);
            }

            return base.VisitRelationalExpression(context);
        }

        // Declaração if
        public override object? VisitIfStatement(ExprCParser.IfStatementContext context)
        {
            object? condition = Visit(context.expression());

            if (Convert.ToBoolean(condition))
            {
                Visit(context.statement(0));
            }
            else if (context.statement().Length > 1)
            {
                Visit(context.statement(1));
            }

            return null;
        }

        // Declaração do while
        public override object? VisitWhileStatement(ExprCParser.WhileStatementContext context)
        {
            while (Convert.ToBoolean(Visit(context.expression())))
            {
                Visit(context.statement());
            }

            return null;
        }

        // Declaração do do while
        public override object? VisitDoWhileStatement(ExprCParser.DoWhileStatementContext context)
        {
            do
            {
                Visit(context.statement());
            } while (Convert.ToBoolean(Visit(context.expression())));

            return null;
        }

        // Declaração do for
        public override object? VisitForStatement(ExprCParser.ForStatementContext context)
        {
            // Inicialização
            Visit(context.expression(0));

            // Condição e corpo do loop
            while (context.expression(1) == null || Convert.ToBoolean(Visit(context.expression(1))))
            {
                Visit(context.statement());

                // Atualização
                if (context.expression(2) != null)
                {
                    Visit(context.expression(2));
                }
            }

            return null;
        }

        // Visitando expressões de atribuição
        public override object? VisitAssignmentExpression(ExprCParser.AssignmentExpressionContext context)
        {
            if (context.ChildCount == 3)
            {
                string varName = context.IDENTIFIER().GetText();
                object? value = Visit(context.logicalOrExpression());
                memory[varName] = value;
                return value;
            }
            else
            {
                return Visit(context.logicalOrExpression());
            }
        }

   
        // Visitando instruções printf
        public override object? VisitPrintfStatement(ExprCParser.PrintfStatementContext context)
        {
            List<object?> args = new List<object?>();

            // Processar todos os argumentos passados para printf
            for (int i = 0; i < context.expression().Length; i++)
            {
                args.Add(Visit(context.expression(i)));
            }

            // Imprimir os argumentos
            for (int i = 0; i < args.Count; i++)
            {
                if (i == 0 && args[i] is string str)
                {
                    Console.Write(str.Replace("\\n", "\n"));
                }
                else
                {
                    Console.Write(args[i]);
                }
            }

            Console.WriteLine(); // Adiciona uma nova linha após a impressão

            return null;
        }

        // Visitando instruções scanf
        public override object? VisitScanfStatement(ExprCParser.ScanfStatementContext context)
        {
            string format = context.STRING_LITERAL().GetText();
            for (int i = 0; i < context.IDENTIFIER().Length; i++)
            {
                string varName = context.IDENTIFIER(i).GetText();
                if (memory.ContainsKey(varName))
                {
                    string? input = Console.ReadLine();
                    if (input != null)
                    {
                        // Verificar o tipo esperado (int ou float)
                        if (format.Contains("%d") && int.TryParse(input, out int intValue))
                        {
                            memory[varName] = intValue;
                        }
                        else if (format.Contains("%f") && float.TryParse(input, out float floatValue))
                        {
                            memory[varName] = floatValue;
                        }
                        else
                        {
                            memory[varName] = input;  // Para outras entradas, armazenar como string
                        }
                    }
                }
                else
                {
                    throw new Exception($"Error: Variable'{varName}' undeclared.");
                }
            }
            return null;
        }

        // Visitando declarações return
        public override object? VisitReturnStatement(ExprCParser.ReturnStatementContext context)
        {
            if (context.expression() != null)
            {
                return Visit(context.expression());
            }
            return null;
        }
      
        // Visitando declarações de ponteiros
        public override object? VisitPointerDeclaration(ExprCParser.PointerDeclarationContext context)
        {
            string varName = context.IDENTIFIER(0).GetText();
            string pointedVarName = context.IDENTIFIER(1).GetText();

            if (memory.TryGetValue(pointedVarName, out object? pointedValue))
            {
                memory[varName] = pointedValue;
                //Console.WriteLine($"Ponteiro '{varName}' inicializado apontando para '{pointedVarName}' com valor: {pointedValue}"); // Para depuração
            }
            else
            {
                throw new Exception($"Error: Variable '{pointedVarName}' undeclared.");
            }

            return null;
        }

         // Visitando declarações ternárias
        public override object? VisitTernaryStatement(ExprCParser.TernaryStatementContext context)
        {
            string varName = context.IDENTIFIER().GetText();
            object? condition = Visit(context.expression(0));
            object? trueExpr = Visit(context.expression(1));
            object? falseExpr = Visit(context.expression(2));

            memory[varName] = Convert.ToBoolean(condition) ? trueExpr : falseExpr;
            //Console.WriteLine($"Variável '{varName}' inicializada com valor: {memory[varName]}"); // Para depuração

            return null;
        }

    }
}