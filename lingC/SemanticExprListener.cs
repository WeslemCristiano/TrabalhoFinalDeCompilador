using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CompiladorTianex.lingC
{
    public class SemanticExprListener : ExprCBaseListener
    {
        public Dictionary<string, IParseTree> Functions { get; protected set; } = new Dictionary<string, IParseTree>();
        public HashSet<string> Variables { get; private set; } = new HashSet<string>();
        public bool HasErrors { get; private set; } = false;
        public List<string> ErrorMessages { get; private set; } = new List<string>();

        // Função main
        public override void ExitMainFunction([NotNull] ExprCParser.MainFunctionContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Main function context is null.");
                return;
            }
        }

        // Declaração de variável
        public override void ExitVariableDeclaration([NotNull] ExprCParser.VariableDeclarationContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Variable declaration context is null.");
                return;
            }

            // Verifica se a variável já foi declarada
            foreach (var declarator in context.variableDeclarator())
            {
                var variableName = declarator.IDENTIFIER().GetText();
                if (Variables.Contains(variableName))
                {
                    HasErrors = true;
                    ErrorMessages.Add($"Variable {variableName} has already been declared.");
                }
                else
                {
                    Variables.Add(variableName);
                }
            }
        }

        // Declaração de função
        public override void ExitFunctionDeclaration([NotNull] ExprCParser.FunctionDeclarationContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Function declaration context is null.");
                return;
            }

            // Verifica se a função já foi declarada
            var functionName = context.IDENTIFIER().GetText();
            if (Functions.ContainsKey(functionName))
            {
                HasErrors = true;
                ErrorMessages.Add($"Function {functionName} has already been declared.");
            }
            else
            {
                Functions[functionName] = context;
            }
        }

        // Chamada de função
        public override void ExitChamadaStatement([NotNull] ExprCParser.ChamadaStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Function call context is null.");
                return;
            }

            // Verifica se a função foi declarada
            var functionName = context.IDENTIFIER().GetText();
            if (!Functions.ContainsKey(functionName))
            {
                HasErrors = true;
                ErrorMessages.Add($"Function {functionName} has not been declared.");
                return;
            }

            // Verifica se o número de argumentos está correto
            var functionContext = Functions[functionName] as ExprCParser.FunctionDeclarationContext;
            var parameterList = functionContext?.parameterList();
            var arguments = context.expression();

            if (parameterList != null && parameterList.parameter().Length != arguments.Length)
            {
                HasErrors = true;
                ErrorMessages.Add($"Function {functionName} called with incorrect number of arguments.");
            }
        }

        // Instrução de retorno
        public override void ExitReturnStatement([NotNull] ExprCParser.ReturnStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Return statement context is null.");
                return;
            }

            // Verifica se a expressão de retorno é válida
            var expression = context.expression();
            if (expression == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Return statement does not have an expression.");
            }
        }

        // Instrução if
        public override void ExitIfStatement([NotNull] ExprCParser.IfStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("If statement context is null.");
                return;
            }

            // Verifica se a expressão condicional é válida
            var condition = context.expression();
            if (condition == null)
            {
                HasErrors = true;
                ErrorMessages.Add("If statement does not have a condition.");
            }
        }

        // Instrução while
        public override void ExitWhileStatement([NotNull] ExprCParser.WhileStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("While statement context is null.");
                return;
            }

            // Verifica se a expressão condicional é válida
            var condition = context.expression();
            if (condition == null)
            {
                HasErrors = true;
                ErrorMessages.Add("While statement does not have a condition.");
            }
        }

        // Instrução for
        public override void ExitForStatement([NotNull] ExprCParser.ForStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("For statement context is null.");
                return;
            }

            // Verifica se as expressões do for são válidas
            var init = context.expression(0);
            var condition = context.expression(1);
            var update = context.expression(2);

            if (init == null || condition == null || update == null)
            {
                HasErrors = true;
                ErrorMessages.Add("For statement does not have valid expressions.");
            }
        }

        // Instrução printf
        public override void ExitPrintfStatement([NotNull] ExprCParser.PrintfStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Printf statement context is null.");
                return;
            }

            // Verifica se a expressão do printf é válida
            var expression = context.expression();
            if (expression == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Printf statement does not have an expression.");
            }
        }

        // Instrução scanf
        public override void ExitScanfStatement([NotNull] ExprCParser.ScanfStatementContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Scanf statement context is null.");
                return;
            }

            // Verifica se a variável do scanf é válida
            var variable = context.IDENTIFIER();
            if (variable == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Scanf statement does not have a variable.");
            }
        }

        // Declaração de ponteiro
        public override void ExitPointerDeclaration([NotNull] ExprCParser.PointerDeclarationContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Pointer declaration context is null.");
                return;
            }

            // Verifica se a variável do ponteiro foi declarada
            var pointerName = context.IDENTIFIER(1).GetText();
            if (!Variables.Contains(pointerName))
            {
                HasErrors = true;
                ErrorMessages.Add($"Pointer variable {pointerName} has not been declared.");
            }
        }

        // Expressões ternárias
        public override void ExitTernaryExpression([NotNull] ExprCParser.TernaryExpressionContext context)
        {
            if (context == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Ternary expression context is null.");
                return;
            }

            // Verifica se a expressão condicional é válida
            var condition = context.logicalOrExpression();
            if (condition == null)
            {
                HasErrors = true;
                ErrorMessages.Add("Ternary expression does not have a condition.");
            }
        }
    }
}