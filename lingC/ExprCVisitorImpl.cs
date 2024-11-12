using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        private Dictionary<string, object?> memory = new Dictionary<string, object?>();
        private Dictionary<string, ExprCParser.FunctionDeclarationContext> functions = new Dictionary<string, ExprCParser.FunctionDeclarationContext>();
        private HashSet<string> callStack = new HashSet<string>();

        // Declaração do programa
        public override object? VisitProgram(ExprCParser.ProgramContext context)
        {
            foreach (var child in context.children)
            {
                if (child is ExprCParser.FunctionDeclarationContext funcDecl)
                {
                    VisitFunctionDeclaration(funcDecl);
                }
                else
                {
                    Visit(child);
                }
            }

            if (functions.ContainsKey("main"))
            {
                Console.WriteLine("Executando função 'main'"); // Para debug
                VisitFunction("main");
            }
            else
            {
                throw new Exception("Erro: Função 'main' não encontrada.");
            }

            return null;
        }

        // Declaração de diretiva de pré-processamento
        public override object? VisitPreprocessorDirective(ExprCParser.PreprocessorDirectiveContext context)
        {
            // Diretivas de pré-processamento não são processadas neste exemplo
            return null;
        }

        // Declaração de declaração de função
        public override object? VisitFunctionDeclaration(ExprCParser.FunctionDeclarationContext context)
        {
            string functionName;
            if (context.IDENTIFIER() != null)
            {
                functionName = context.IDENTIFIER().GetText();
            }
            else if (context.GetChild(1).GetText() == "main")
            {
                functionName = "main";
            }
            else
            {
                throw new Exception("Erro: Identificador da função não encontrado.");
            }

            functions[functionName] = context;
            Console.WriteLine($"Função '{functionName}' declarada."); // Para debug

            return null;
        }

        // Declaração de chamada de função
        private void VisitFunction(string functionName)
        {
            if (callStack.Contains(functionName))
            {
                throw new Exception($"Erro: Loop infinito detectado na função '{functionName}'.");
            }

            callStack.Add(functionName);

            var functionContext = functions[functionName];
            Visit(functionContext.block());

            callStack.Remove(functionName);
        }

        // Declaração de chamada de função
        public override object? VisitFunctionCall(ExprCParser.FunctionCallContext context)
        {
            string functionName = context.IDENTIFIER().GetText();
            if (functions.ContainsKey(functionName))
            {
                if (!callStack.Contains(functionName))
                {
                    Console.WriteLine($"Chamando função '{functionName}'"); // Para debug
                    VisitFunction(functionName);
                }
            }
            else
            {
                throw new Exception($"Erro: Função '{functionName}' não declarada.");
            }

            return null;
        }

        // Declaração de declaração de variável
        public override object? VisitVariableDeclaration(ExprCParser.VariableDeclarationContext context)
        {
            string varName = context.IDENTIFIER().GetText();

            if (context.arrayInitializer() != null)
            {
                List<object?> values = new List<object?>();
                foreach (var expr in context.arrayInitializer().expression())
                {
                    values.Add(Visit(expr));
                }
                memory[varName] = values.ToArray();
                Console.WriteLine($"Array '{varName}' inicializado com valores: {string.Join(", ", values)}"); // Para debug
            }
            else if (context.expression() != null)
            {
                object? value = Visit(context.expression());
                memory[varName] = value;
                Console.WriteLine($"Variável '{varName}' inicializada com valor: {value}"); // Para debug
            }
            else
            {
                memory[varName] = null;
                Console.WriteLine($"Variável '{varName}' declarada sem inicialização."); // Para debug
            }

            return null;
        }

        // Suporte para ponteiros
        public override object VisitType([NotNull] ExprCParser.TypeContext context)
        {
            string type = context.GetText();
            if (type.Contains("*"))
            {
                return type;
            }
            return base.VisitType(context);
        }

        // Declaração de struct
        public override object? VisitStructDeclaration(ExprCParser.StructDeclarationContext context)
        {
            string structName = context.IDENTIFIER().GetText();
            Console.WriteLine($"Declaração de struct '{structName}'"); // Para debug

            foreach (var member in context.structMember())
            {
                Visit(member);
            }

            return null;
        }

        // Declaração de union
        public override object? VisitUnionDeclaration(ExprCParser.UnionDeclarationContext context)
        {
            string unionName = context.IDENTIFIER().GetText();
            Console.WriteLine($"Declaração de union '{unionName}'"); // Para debug

            foreach (var member in context.unionMember())
            {
                Visit(member);
            }

            return null;
        }

        // Declaração de structMember
        public override object? VisitStructMember(ExprCParser.StructMemberContext context)
        {
            string memberName = context.IDENTIFIER().GetText();
            Console.WriteLine($"Membro de struct '{memberName}' declarado."); // Para debug

            return null;
        }

        // Declaração de unionMember
        public override object? VisitUnionMember(ExprCParser.UnionMemberContext context)
        {
            string memberName = context.IDENTIFIER().GetText();
            Console.WriteLine($"Membro de union '{memberName}' declarado."); // Para debug

            return null;
        }

        // Declaração de expressão
        public override object? VisitExpressionStatement(ExprCParser.ExpressionStatementContext context)
        {
            return Visit(context.expression());
        }

        // Declaração de expressão de atribuição
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

        // Declaração de expressão condicional
        public override object? VisitConditionalExpression(ExprCParser.ConditionalExpressionContext context)
        {
            object? condition = Visit(context.logicalOrExpression());
            if (context.expression().Length == 2)
            {
                if (Convert.ToBoolean(condition))
                {
                    return Visit(context.expression(0));
                }
                else
                {
                    return Visit(context.expression(1));
                }
            }
            return condition;
        }

        // Declaração de expressão lógica OR
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

        // Declaração de expressão lógica AND
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

        // Declaração de expressão de igualdade
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

        // Declaração de expressão relacional
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

        // Declaração de expressão aditiva
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

        // Declaração de expressão multiplicativa
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

        // Declaração de expressão primária
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
                    throw new Exception($"Erro: Variável '{varName}' não declarada.");
                }
            }
            else if (context.functionCall() != null)
            {
                return Visit(context.functionCall());
            }
            else if (context.expression() != null)
            {
                return Visit(context.expression());
            }
            else if (context.GetChild(0).GetText() == "sizeof")
            {
                // Implementar lógica para sizeof se necessário
                return 4; // Exemplo: retornando 4 bytes para int
            }
            else
            {
                return null;
            }
        }

        // Declaração do if
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

        // Declaração do do-while
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

        // Declaração do switch
        public override object? VisitSwitchStatement(ExprCParser.SwitchStatementContext context)
        {
            object? switchValue = Visit(context.expression());
            bool isCaseFound = false;

            foreach (var caseStmt in context.caseStatement())
            {
                if (!isCaseFound)
                {
                    object? caseValue = Visit(caseStmt.CONSTANT());
                    if (switchValue != null && switchValue.Equals(caseValue))
                    {
                        isCaseFound = true;
                    }
                }

                if (isCaseFound)
                {
                    foreach (var stmt in caseStmt.statement())
                    {
                        Visit(stmt);
                    }
                    break; // Interrompe a execução após encontrar um case correspondente
                }
            }

            if (!isCaseFound && context.defaultStatement() != null)
            {
                foreach (var stmt in context.defaultStatement().statement())
                {
                    Visit(stmt);
                }
            }

            return null;
        }

        // Declaração do block
        public override object? VisitBlock(ExprCParser.BlockContext context)
        {
            foreach (var statement in context.statement())
            {
                Visit(statement);
            }

            return null;
        }

        // Declaração do return
        public override object? VisitReturnStatement(ExprCParser.ReturnStatementContext context)
        {
            if (context.expression() != null) // Se houver uma expressão de retorno
            {
                return Visit(context.expression());
            }
            else
            {
                return null;
            }
        }

        // Declaração do printf
        public override object? VisitPrintfStatement(ExprCParser.PrintfStatementContext context)
        {
            string format = context.STRING_LITERAL().GetText();
            List<object?> args = new List<object?>();

            for (int i = 0; i < context.expression().Length; i++)
            {
                object? value = Visit(context.expression(i));
                if (format.Contains("%d"))
                {
                    if (value is object[] array)
                    {
                        foreach (var item in array)
                        {
                            args.Add(Convert.ToInt32(item));
                        }
                    }
                    else
                    {
                        args.Add(Convert.ToInt32(value));
                    }
                }
                else
                {
                    args.Add(value);
                }
            }

            format = format.Substring(1, format.Length - 2);
            format = format.Replace("%d", "{0}").Replace("%f", "{1}").Replace("%s", "{2}").Replace("%c", "{3}");

            string output = string.Format(format, args.ToArray());
            Console.WriteLine(output.Replace("\\n", "\n"));

            return null;
        }

        // Declaração do scanf
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
    }
}