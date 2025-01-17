﻿using System;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using lingC;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length == 0)
        {
            Console.WriteLine();
            Console.WriteLine("Por favor, forneça o caminho para o arquivo .Tianex!!!\n");
            return;
        }

        string filePath = args[0];

        if (!File.Exists(filePath))
        {
            Console.WriteLine($"Arquivo não encontrado: {filePath}");
            return;
        }

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
            Console.WriteLine("Erros de sintaxe encontrados:");
            foreach (var errorMessage in errorListener.ErrorMessages)
            {
                Console.WriteLine(errorMessage);
            }
            return;
        }

        ExprCVisitorImpl visitor = new ExprCVisitorImpl();
        visitor.Visit(tree);
    }
}
// Para de debugar o código         
//         string input = @"
//     #include <stdio.h>

//     int main() {
//         int a = 5;
//         int b = 10;
//         int c = a + b;

//         printf(""Hello, World! %d\n"", c);

//         return 0;
//     }
// ";