using System;
using System.Collections.Generic;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        // Dicionário para armazenar variáveis e seus valores
        private Dictionary<string, object?> memory = new Dictionary<string, object?>();

        // Modo de depuração
        private bool debugMode = false;

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

            if (parameterList != null && parameterList.parameter().Length != arguments.Length)
            {
                throw new Exception($"Error: Incorrect number of arguments for function'{functionName}'.");
            }
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

        // Visitando declarações de constantes
        public override object? VisitDefineDirective(ExprCParser.DefineDirectiveContext context)
        {
            string varName = context.IDENTIFIER().GetText();
            object? value = double.Parse(context.CONSTANT().GetText());
            memory[varName] = value;
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
            if (context.primaryExpression() != null)
            {
                return Visit(context.primaryExpression());
            }
            else
            {
                string varName = context.GetChild(1).GetText();
                if (memory.TryGetValue(varName, out object? value))
                {
                    if (context.GetChild(0).GetText() == "++")
                    {
                        memory[varName] = Convert.ToDouble(memory[varName]) + 1;
                    }
                    else if (context.GetChild(0).GetText() == "--")
                    {
                        memory[varName] = Convert.ToDouble(memory[varName]) - 1;
                    }
                    else if (context.GetChild(0).GetText() == "!")
                    {
                        memory[varName] = !Convert.ToBoolean(memory[varName]);
                    }
                    else if (context.GetChild(0).GetText() == "&")
                    {
                        return memory[varName];
                    }

                    return memory[varName];
                }
                else
                {
                    throw new Exception($"Error: Variable '{varName}' undeclared.");
                }
            }
        }

        // Visitando constantes (números inteiros e floats) dentro da expressão primária
        public override object? VisitPrimaryExpression(ExprCParser.PrimaryExpressionContext context)
        {
            if (context.CONSTANT() != null)
            {

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
                return context.STRING_LITERAL().GetText().Trim('"');
            }
            else
            {
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
            if (context.expression(0) != null)
            {
                Visit(context.expression(0));
            }

            while (context.expression(1) == null || Convert.ToBoolean(Visit(context.expression(1))))
            {
                Visit(context.statement());

                if (context.expression(2) != null)
                {
                    Visit(context.expression(2));
                }
            }

            return null;
        }

        // Declaração switch
        public override object? VisitSwitchStatement(ExprCParser.SwitchStatementContext context)
        {
            object? switchValue = Visit(context.expression());
            bool caseMatched = false;

            foreach (var caseStatement in context.caseStatement())
            {
                object? caseValue = double.Parse(caseStatement.CONSTANT().GetText());
                if (switchValue.Equals(caseValue))
                {
                    caseMatched = true;
                    foreach (var statement in caseStatement.statement())
                    {
                        Visit(statement);
                    }
                    break;
                }
            }

            if (!caseMatched && context.defaultStatement() != null)
            {
                foreach (var statement in context.defaultStatement().statement())
                {
                    Visit(statement);
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
            for (int i = 0; i < context.expression().Length; i++)
            {
                args.Add(Visit(context.expression(i)));
            }
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
            Console.WriteLine(); 
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
                            memory[varName] = input;
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
                object? returnValue = Visit(context.expression());
                return returnValue;
            }
            return null;
        }

        // Declaração de ponteiro

        public override object? VisitPointerDeclaration(ExprCParser.PointerDeclarationContext context)
        {
            
            string varName = context.IDENTIFIER(0).GetText();
            string pointerName = context.IDENTIFIER(1).GetText();

            if (context.GetChild(3) != null)
            {
                memory[varName] = memory[pointerName];
            }
            else
            {
                memory[varName] = null;
            }
            return null;
        }


        // Expressões ternárias
        public override object? VisitTernaryExpression(ExprCParser.TernaryExpressionContext context)
        {
            object? condition = Visit(context.logicalOrExpression());
            if (condition == null)
            {
                throw new Exception("Error: Ternary condition cannot be null.");
            }

            if (Convert.ToBoolean(condition))
            {
                return Visit(context.statement(0));
            }
            else
            {
                return Visit(context.statement(1));
            }
        }

    }
}