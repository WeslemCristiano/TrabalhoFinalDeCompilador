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
        int a = 5;
        int b = 10;
        int c = 15;

        if (a < b && b < c) {
            printf(""a < b && b < c é verdadeiro\n"");
        }

        if (a > b || b < c) {
            printf(""a > b || b < c é verdadeiro\n"");
        }

        if (a == 5 && b != 10) {
            printf(""a == 5 && b != 10 é verdadeiro\n"");
        } else {
            printf(""a == 5 && b != 10 é falso\n"");
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