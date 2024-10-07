using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using lingC;
using System;

 class Program
{
    static void Main(string[] args)
    {
        string input = @"
            #include <stdio.h>

            int main() {
                int n;
                printf(""Digite um número: "");
                scanf(""%d"", &n);
                printf(""O numero é %d\n"", n);
                return 0;
            }
        ";

        AntlrInputStream inputStream = new AntlrInputStream(input);
        ExprCLexer lexer = new ExprCLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ExprCParser parser = new ExprCParser(commonTokenStream);

        IParseTree tree = parser.program();
        ExprCVisitorImpl visitor = new ExprCVisitorImpl();
        visitor.Visit(tree);
    }
}