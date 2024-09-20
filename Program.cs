using System;
using System.IO;
using Antlr4.Runtime;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length == 0)
        {
            Console.WriteLine("Por favor, forneça o caminho para o arquivo .c como argumento.");
            return;
        }

        string filePath = args[0];
        if (!File.Exists(filePath))
        {
            Console.WriteLine($"Arquivo não encontrado: {filePath}");
            return;
        }

        string code = File.ReadAllText(filePath);
        AntlrInputStream inputStream = new AntlrInputStream(code);
        CSubsetLexer lexer = new CSubsetLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        CSubsetParser parser = new CSubsetParser(commonTokenStream);

        EvalListener listener = new EvalListener();
        parser.AddParseListener(listener); 
        parser.program(); 
    }
}