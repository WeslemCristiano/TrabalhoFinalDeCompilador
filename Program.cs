using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using lingC;

class Program
{
    static void Main(string[] args)
    {
        string input = @"
    #include <stdio.h>

    int main() {
        int i = 0;

        for (i = 0; i < 10; i = i + 1) {
            printf(""Hello, World!\n"");
        }

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