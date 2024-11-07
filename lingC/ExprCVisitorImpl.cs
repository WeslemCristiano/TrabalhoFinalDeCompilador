using System;
using System.Collections.Generic;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        private Dictionary<string, object?> memory = new Dictionary<string, object?>();

        public override object? VisitVariableDeclaration(ExprCParser.VariableDeclarationContext context)
        {
            string varName = context.IDENTIFIER().GetText();

            if (context.expression() != null)
            {
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
            else
            {
                return Visit(context.expression());
            }
        }

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

        public override object? VisitWhileStatement(ExprCParser.WhileStatementContext context)
        {
            while (Convert.ToBoolean(Visit(context.expression())))
            {
                Visit(context.statement());
            }

            return null;
        }

        public override object? VisitDoWhileStatement(ExprCParser.DoWhileStatementContext context)
        {
            do
            {
                Visit(context.statement());
            } while (Convert.ToBoolean(Visit(context.expression())));

            return null;
        }

        public override object? VisitForStatement(ExprCParser.ForStatementContext context)
        {
            for (Visit(context.expression(0)); Convert.ToBoolean(Visit(context.expression(1))); Visit(context.expression(2)))
            {
                Visit(context.statement());
            }

            return null;
        }

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

        public override object? VisitPrintfStatement(ExprCParser.PrintfStatementContext context)
        {
            string format = context.STRING_LITERAL().GetText();
            List<object?> args = new List<object?>();

            for (int i = 0; i < context.expression().Length; i++)
            {
                object? value = Visit(context.expression(i));
                if (format.Contains("%d"))
                {
                    args.Add(Convert.ToInt32(value));
                }
                else
                {
                    args.Add(value);
                }
            }

            format = format.Substring(1, format.Length - 2);
            format = format.Replace("%d", "{0}").Replace("%f", "{1}");

            string output = string.Format(format, args.ToArray());
            Console.WriteLine(output.Replace("\\n", "\n"));

            return null;
        }

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
                    throw new Exception($"Erro: Variável '{varName}' não declarada.");
                }
            }
            return null;
        }
    }
}