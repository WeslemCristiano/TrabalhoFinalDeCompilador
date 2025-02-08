using System;
using System.Collections.Generic;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        private Stack<Dictionary<string, object?>> memoryStack = new Stack<Dictionary<string, object?>>();
        private bool debugMode = false;
        private Dictionary<string, ExprCParser.FunctionDeclarationContext> functions = new Dictionary<string, ExprCParser.FunctionDeclarationContext>();

        public ExprCVisitorImpl()
        {
            // Inicializa a pilha com um escopo global
            memoryStack.Push(new Dictionary<string, object?>());
        }

        
        // Visitando declarações de funções
        public override object? VisitFunctionDeclaration(ExprCParser.FunctionDeclarationContext context)
        {
            string functionName = context.IDENTIFIER().GetText();
            functions[functionName] = context;
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
                throw new Exception($"Error: Incorrect number of arguments for function '{functionName}'.");
            }

            // Cria um novo escopo para a função
            memoryStack.Push(new Dictionary<string, object?>());

            // Atribuir valores dos argumentos aos parâmetros
            if (parameterList != null)
            {
                for (int i = 0; i < parameterList.parameter().Length; i++)
                {
                    string paramName = parameterList.parameter(i).IDENTIFIER().GetText();
                    object? argValue = Visit(arguments[i]);
                    memoryStack.Peek()[paramName] = argValue;
                }
            }

            // Executar o corpo da função
            object? result = Visit(functionContext.block());

            // Remove o escopo da função
            memoryStack.Pop();

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
                    memoryStack.Peek()[varName] = value;
                }
                else
                {
                    memoryStack.Peek()[varName] = null;
                }
            }

            return null;
        }

        // Visitando declarações de constantes
        public override object? VisitDefineDirective(ExprCParser.DefineDirectiveContext context)
        {
            string varName = context.IDENTIFIER().GetText();
            object? value = double.Parse(context.CONSTANT().GetText());
            memoryStack.Peek()[varName] = value;
            return null;
        }

        // Visitando declarações de structs
        public override object? VisitStructDeclaration(ExprCParser.StructDeclarationContext context)
        {
            string structName = context.IDENTIFIER().GetText();

            if (memoryStack.Peek().ContainsKey(structName))
            {
                throw new Exception($"Erro: A struct '{structName}' já foi declarada.");
            }

            var structMembers = new Dictionary<string, (string Type, int? ArraySize)>();

            foreach (var memberContext in context.structMember())
            {
                string memberType = memberContext.type().GetText();
                string memberName = memberContext.IDENTIFIER().GetText();

                int? arraySize = null;
                if (memberContext.CONSTANT() != null)
                {
                    arraySize = int.Parse(memberContext.CONSTANT().GetText());
                }

                structMembers[memberName] = (memberType, arraySize);
            }
            memoryStack.Peek()[structName] = structMembers;

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
                if (memoryStack.Peek().TryGetValue(varName, out object? value))
                {
                    if (context.GetChild(0).GetText() == "++")
                    {
                        memoryStack.Peek()[varName] = Convert.ToDouble(memoryStack.Peek()[varName]) + 1;
                    }
                    else if (context.GetChild(0).GetText() == "--")
                    {
                        memoryStack.Peek()[varName] = Convert.ToDouble(memoryStack.Peek()[varName]) - 1;
                    }
                    else if (context.GetChild(0).GetText() == "!")
                    {
                        memoryStack.Peek()[varName] = !Convert.ToBoolean(memoryStack.Peek()[varName]);
                    }
                    else if (context.GetChild(0).GetText() == "&")
                    {
                        return memoryStack.Peek()[varName];
                    }

                    return memoryStack.Peek()[varName];
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
                string constantText = context.CONSTANT().GetText();
                if (double.TryParse(constantText, out double numericValue))
                {
                    return numericValue;
                }
                else if (bool.TryParse(constantText, out bool boolValue))
                {
                    return boolValue;
                }
                else
                {
                    throw new Exception($"Error: Unable to parse constant '{constantText}'.");
                }
            }
            else if (context.IDENTIFIER().Length > 0)
            {
                string varName = context.IDENTIFIER(0).GetText();

                foreach (var scope in memoryStack)
                {
                    if (scope.ContainsKey(varName))
                    {
                        object? value = scope[varName];

                        // Verifica se há indexação de array
                        if (context.expression().Length > 0)
                        {
                            foreach (var expr in context.expression())
                            {
                                int index = Convert.ToInt32(Visit(expr));
                                if (value is object?[] array)
                                {
                                    value = array[index];
                                }
                                else
                                {
                                    throw new Exception($"Error: Variable '{varName}' is not an array.");
                                }
                            }
                        }

                        return value;
                    }
                }

                throw new Exception($"Error: Variable '{varName}' undeclared.");
            }
            else if (context.STRING_LITERAL() != null)
            {
                return context.STRING_LITERAL().GetText().Trim('"');
            }
            else
            {
                return Visit(context.expression(0));
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

        // Visitando declarações de arrays
        public override object? VisitArrayDeclaration(ExprCParser.ArrayDeclarationContext context)
        {
            // Obtém o tipo do array
            string type = context.type().GetText();

            // Obtém o nome do array
            string arrayName = context.IDENTIFIER().GetText();

            // Obtém o tamanho do array
            int arraySize = int.Parse(context.CONSTANT().GetText());

            // Cria o array
            var array = new object?[arraySize];

            // Inicializa o array com os valores fornecidos
            if (context.expression() != null)
            {
                var expressions = context.expression();
                for (int i = 0; i < expressions.Length; i++)
                {
                    array[i] = Visit(expressions[i]);
                }
            }

            // Armazena o array no escopo atual
            memoryStack.Peek()[arrayName] = array;

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
                memoryStack.Peek()[varName] = value;
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
                foreach (var scope in memoryStack)
                {
                    if (scope.ContainsKey(varName))
                    {
                        string? input = Console.ReadLine();
                        if (input != null)
                        {
                            if (format.Contains("%d") && int.TryParse(input, out int intValue))
                            {
                                scope[varName] = intValue;
                            }
                            else if (format.Contains("%f") && float.TryParse(input, out float floatValue))
                            {
                                scope[varName] = floatValue;
                            }
                            else
                            {
                                scope[varName] = input;
                            }
                        }
                        break;
                    }
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
                memoryStack.Peek()[varName] = memoryStack.Peek()[pointerName];
            }
            else
            {
                memoryStack.Peek()[varName] = null;
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