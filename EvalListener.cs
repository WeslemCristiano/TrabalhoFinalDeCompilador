using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

public class EvalListener : CSubsetBaseListener, IParseTreeVisitor<object>
{
    private Dictionary<string, object> variables = new Dictionary<string, object>();

    // Tratamento de declaração de variáveis
    public override void ExitVarDeclaration(CSubsetParser.VarDeclarationContext context)
    {
        foreach (var varDeclarator in context.varDeclarator())
        {
            string varName = varDeclarator.IDENTIFIER().GetText();
            object? value = null;
            if (varDeclarator.expr() != null)
            {
                value = EvaluateExpression(varDeclarator.expr());
            }
            variables[varName] = value!;
        }
    }

    // Avaliação de expressões
    public override void ExitExpr(CSubsetParser.ExprContext context)
    {
        // Aqui vamos avaliar as expressões aritméticas, lógicas e de comparação
        if (context.NUMBER() != null)
        {
            string numberText = context.NUMBER().GetText();
            if (numberText.Contains("."))
            {
                context.SetResult((object)float.Parse(numberText));  // Supondo que seja um número de ponto flutuante
            }
            else
            {
                context.SetResult((object)int.Parse(numberText));  // Supondo que seja um número inteiro
            }
        }
        else if (context.IDENTIFIER() != null)
        {
            string varName = context.IDENTIFIER().GetText();
            if (variables.ContainsKey(varName))
            {
                context.SetResult(variables[varName]);
            }
            else
            {
                throw new Exception($"Variable {varName} not defined");
            }
        }
        else if (context.ChildCount == 3) // Operações do tipo: expr OP expr
        {
            var left = EvaluateExpression(context.expr(0));
            var right = EvaluateExpression(context.expr(1));
            var op = context.GetChild(1).GetText();

            switch (op)
            {
                case "+":
                    context.SetResult((object)((dynamic)left! + (dynamic)right!));
                    break;
                case "-":
                    context.SetResult((object)((dynamic)left! - (dynamic)right!));
                    break;
                case "*":
                    context.SetResult((object)((dynamic)left! * (dynamic)right!));
                    break;
                case "/":
                    context.SetResult((object)((dynamic)left! / (dynamic)right!));
                    break;
                case "==":
                    context.SetResult((object)((dynamic)left! == (dynamic)right!));
                    break;
                case "!=":
                    context.SetResult((object)((dynamic)left! != (dynamic)right!));
                    break;
                case "<":
                    context.SetResult((object)((dynamic)left! < (dynamic)right!));
                    break;
                case ">":
                    context.SetResult((object)((dynamic)left! > (dynamic)right!));
                    break;
                case "<=":
                    context.SetResult((object)((dynamic)left! <= (dynamic)right!));
                    break;
                case ">=":
                    context.SetResult((object)((dynamic)left! >= (dynamic)right!));
                    break;
                case "&&":
                    context.SetResult((object)((bool)left! && (bool)right!));
                    break;
                case "||":
                    context.SetResult((object)((bool)left! || (bool)right!));
                    break;
                default:
                    throw new Exception("Operador desconhecido: " + op);
            }
        }
        else if (context.ChildCount == 2) // Operações do tipo: OP expr (ex: -expr, !expr)
        {
            var right = EvaluateExpression(context.expr(0));
            var op = context.GetChild(0).GetText();

            switch (op)
            {
                case "-":
                    context.SetResult((object)(-(dynamic)right!));
                    break;
                case "!":
                    context.SetResult((object)(!(bool)right!));
                    break;
                default:
                    throw new Exception("Operador desconhecido: " + op);
            }
        }
    }

    // Funções de Entrada/Saída (printf/scanf)
    public override void ExitIoFunction(CSubsetParser.IoFunctionContext context)
    {
        if (context.GetText().StartsWith("printf"))
        {
            string formatString = context.STRING().GetText().Trim('"');
            List<object> args = new List<object>();

            foreach (var identifier in context.IDENTIFIER())
            {
                string varName = identifier.GetText();
                if (variables.ContainsKey(varName))
                {
                    args.Add(variables[varName]);
                }
                else
                {
                    throw new Exception($"Variable {varName} not defined");
                }
            }
            formatString = formatString.Replace("%d", "{0}").Replace("%f", "{0:F}");
            Console.WriteLine(string.Format(formatString, args.ToArray()));
        }
        else if (context.GetText().StartsWith("scanf"))
        {
            string formatString = context.STRING().GetText().Trim('"');
            string varName = context.IDENTIFIER(0).GetText();
            if (variables.ContainsKey(varName))
            {
                string? input = Console.ReadLine();
                if (variables[varName] is int)
                {
                    variables[varName] = int.Parse(input!);
                }
                else if (variables[varName] is float)
                {
                    variables[varName] = float.Parse(input!);
                }
                else if (variables[varName] is bool)
                {
                    variables[varName] = bool.Parse(input!);
                }
                else
                {
                    variables[varName] = input; // Assumimos string
                }
            }
            else
            {
                throw new Exception($"Variable {varName} not defined");
            }
        }
    }

    // Tratamento de estruturas condicionais
    public override void ExitIfStatement(CSubsetParser.IfStatementContext context)
    {
        var condition = EvaluateExpression(context.expr());
        if ((bool)condition!)
        {
            // Executa o bloco 'if'
            ExecuteBlock(context.statement(0));
        }
        else if (context.statement().Length > 1)
        {
            // Executa o bloco 'else'
            ExecuteBlock(context.statement(1));
        }
    }

    // Método auxiliar para avaliar expressões
    private object? EvaluateExpression(CSubsetParser.ExprContext context)
    {
        return context.GetResult();
    }

    // Método auxiliar para executar blocos de código
    private void ExecuteBlock(CSubsetParser.StatementContext context)
    {
        // Aqui você pode adicionar a lógica para executar o bloco de código
        // Por exemplo, você pode chamar context.Accept(this) para visitar o bloco
        context.Accept(this);
    }

    // Implementação da interface IParseTreeVisitor<object>
    public object Visit(IParseTree tree)
    {
        return tree.Accept(this);
    }

    public object VisitChildren(IRuleNode node)
    {
        object result = DefaultResult;
        int n = node.ChildCount;
        for (int i = 0; i < n; i++)
        {
            if (!ShouldVisitNextChild(node, result))
            {
                break;
            }

            IParseTree c = node.GetChild(i);
            object childResult = c.Accept(this);
            result = AggregateResult(result, childResult);
        }

        return result;
    }

    public object VisitTerminal(ITerminalNode node)
    {
        return DefaultResult;
    }

    public object VisitErrorNode(IErrorNode node)
    {
        return DefaultResult;
    }

    protected virtual object DefaultResult
    {
        get { return null; }
    }

    protected virtual object AggregateResult(object aggregate, object nextResult)
    {
        return nextResult;
    }

    protected virtual bool ShouldVisitNextChild(IRuleNode node, object currentResult)
    {
        return true;
    }
}

// Classe auxiliar para armazenar o resultado das expressões
public static class ExprContextExtensions
{
    private static readonly Dictionary<CSubsetParser.ExprContext, object?> results = new Dictionary<CSubsetParser.ExprContext, object?>();

    public static object? GetResult(this CSubsetParser.ExprContext context)
    {
        return results.TryGetValue(context, out var result) ? result : null;
    }

    public static void SetResult(this CSubsetParser.ExprContext context, object? value)
    {
        results[context] = value;
    }
}