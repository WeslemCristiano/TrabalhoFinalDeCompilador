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
            Console.WriteLine($"Função '{functionName}' declarada.");
            return null;
        }

        // Visitando chamadas de funções
        public override object? VisitChamadaStatement(ExprCParser.ChamadaStatementContext context)
        {
            string functionName = context.IDENTIFIER().GetText();

            if (!functions.ContainsKey(functionName))
            {
                throw new Exception($"Erro: Função '{functionName}' não declarada.");
            }

            ExprCParser.FunctionDeclarationContext functionContext = functions[functionName];
            ExprCParser.ParameterListContext? parameterList = functionContext.parameterList();
            var arguments = context.expression();

            // Verificar se o número de argumentos corresponde ao número de parâmetros
            if (parameterList != null && parameterList.parameter().Length != arguments.Length)
            {
                throw new Exception($"Erro: Número incorreto de argumentos para a função '{functionName}'.");
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
                throw new Exception("Erro: Função 'main' não declarada.");
            }
        }

        // Visitando declarações de variáveis
        public override object? VisitVariableDeclaration(ExprCParser.VariableDeclarationContext context)
        {
            string varName = context.IDENTIFIER().GetText();

            if (context.expression() != null)
            {
                // Avalia a expressão do lado direito da atribuição
                object? value = Visit(context.expression());
                memory[varName] = value;
                Console.WriteLine($"Variável '{varName}' inicializada com valor: {value}");
            }
            else
            {
                memory[varName] = null;
                Console.WriteLine($"Variável '{varName}' declarada sem inicialização.");
            }

            return null;
        }

        // Visitando expressões aritméticas (adição e subtração)
        public override object? VisitAdditiveExpression(ExprCParser.AdditiveExpressionContext context)
        {
            object? left = Visit(context.multiplicativeExpression(0));
            object? right = context.multiplicativeExpression().Length > 1 ? Visit(context.multiplicativeExpression(1)) : 0;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "+")
            {
                return Convert.ToDouble(left) + Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == "-")
            {
                return Convert.ToDouble(left) - Convert.ToDouble(right);
            }

            return base.VisitAdditiveExpression(context);
        }

         // Declaração de expressão matemática (multiplicação, divisão e módulo)
        public override object? VisitMultiplicativeExpression(ExprCParser.MultiplicativeExpressionContext context)
        {
            object? left = Visit(context.unaryExpression(0));
            object? right = context.unaryExpression().Length > 1 ? Visit(context.unaryExpression(1)) : 1;

            if (context.GetChild(1) != null && context.GetChild(1).GetText() == "*")
            {
                return Convert.ToDouble(left) * Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == "/")
            {
                return Convert.ToDouble(left) / Convert.ToDouble(right);
            }
            else if (context.GetChild(1) != null && context.GetChild(1).GetText() == "%")
            {
                return Convert.ToDouble(left) % Convert.ToDouble(right);
            }

            return base.VisitMultiplicativeExpression(context);
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
                    throw new Exception($"Erro: Variável '{varName}' não declarada.");
                }
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
            foreach (var arg in args)
            {
                Console.WriteLine(arg);
            }

            return null;
        }

        // Instruções de scanf
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
                        if (format.Contains("%d") && int.TryParse(input, out int intValue))
                        {
                            memory[varName] = intValue;
                        }
                        else if (format.Contains("%f") && float.TryParse(input, out float floatValue))
                        {
                            memory[varName] = floatValue;
                        }
                        else if (format.Contains("%c") && char.TryParse(input, out char charValue))
                        {
                            memory[varName] = charValue;
                        }
                        else if (format.Contains("%s"))
                        {
                            memory[varName] = input;
                        }
                        else
                        {
                            memory[varName] = input;
                        }
                    }
                }
                else
                {
                    throw new Exception($"Erro: Variável '{varName}' não declarada.");
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
    }
}