using System;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using lingC;
using CompiladorTianex.lingC; 

class Program
{
    static void Main(string[] args)
    {
        string filePath = args[0];
        string input = File.ReadAllText(filePath);

        AntlrInputStream inputStream = new AntlrInputStream(input);
        ExprCLexer lexer = new ExprCLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ExprCParser parser = new ExprCParser(commonTokenStream);

        // Adiciona o ErrorListener ao lexer e ao parser
        ErrorListener errorListener = new ErrorListener();
        lexer.RemoveErrorListeners();
        lexer.AddErrorListener(errorListener);
        parser.RemoveErrorListeners();
        parser.AddErrorListener(errorListener);

        IParseTree tree = parser.program();

        // Verifica se houve erros de sintaxe
        if (errorListener.HasErrors)
        {
            Console.WriteLine("Syntax errors found: ");
            foreach (var errorMessage in errorListener.ErrorMessages)
            {
                Console.WriteLine(errorMessage);
            }
            return;
        }

        // Verificação semântica
        SemanticExprListener semanticListener = new SemanticExprListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.Walk(semanticListener, tree);

        // Verifica se houve erros semânticos
        if (semanticListener.HasErrors)
        {
            Console.WriteLine("Semantic errors found: ");
            foreach (var errorMessage in semanticListener.ErrorMessages)
            {
                Console.WriteLine(errorMessage);
            }
            return;
        }

        // Visitação da árvore de análise
        ExprCVisitorImpl visitor = new ExprCVisitorImpl();
        visitor.Visit(tree);
    }
}