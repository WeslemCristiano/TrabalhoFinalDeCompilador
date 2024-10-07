using System;
using System.Collections.Generic;

namespace lingC
{
    public class ExprCVisitorImpl : ExprCBaseVisitor<object?>
    {
        // Dicionário para armazenar variáveis e seus valores
        private Dictionary<string, object?> memory = new Dictionary<string, object?>();

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

        // Visitando estruturas if
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

        // Visitando estruturas while
        public override object? VisitWhileStatement(ExprCParser.WhileStatementContext context)
        {
            while (Convert.ToBoolean(Visit(context.expression())))
            {
                Visit(context.statement());
            }

            return null;
        }

        // Visitando estruturas do-while
        public override object? VisitDoWhileStatement(ExprCParser.DoWhileStatementContext context)
        {
            do
            {
                Visit(context.statement());
            } while (Convert.ToBoolean(Visit(context.expression())));

            return null;
        }

        // Visitando estruturas for
        public override object? VisitForStatement(ExprCParser.ForStatementContext context)
        {
            for (Visit(context.expression(0)); Convert.ToBoolean(Visit(context.expression(1))); Visit(context.expression(2)))
            {
                Visit(context.statement());
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
            string format = context.STRING_LITERAL().GetText();
            List<object?> args = new List<object?>();

            // Processar todos os argumentos passados para printf
            for (int i = 0; i < context.expression().Length; i++)
            {
                args.Add(Visit(context.expression(i)));
            }

            // Remover as aspas da string de formato
            format = format.Substring(1, format.Length - 2);

            // Substituir especificadores de formato %d e %f por placeholders do C#
            format = format.Replace("%d", "{0}").Replace("%f", "{1}");

            // Verificar se o número de argumentos corresponde ao número de especificadores
            string output = string.Format(format, args.ToArray());

            // Imprimir o resultado, incluindo suporte para \n
            Console.WriteLine(output.Replace("\\n", "\n"));

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
                    throw new Exception($"Erro: Variável '{varName}' não declarada.");
                }
            }
            return null;
        }
    }
}