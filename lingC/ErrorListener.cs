using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.IO;

namespace lingC
{
    public class ErrorListener : BaseErrorListener, IAntlrErrorListener<int>
    {
        public bool HasErrors { get; private set; } = false;
        public List<string> ErrorMessages { get; private set; } = new List<string>();

        public override void SyntaxError(TextWriter output, 
                                         IRecognizer recognizer, IToken offendingSymbol, 
                                         int line, int charPositionInLine, 
                                         string msg, RecognitionException e)
        {
            HasErrors = true;
            string errorMessage = $"Erro de sintaxe na linha {line}, posição {charPositionInLine}: {msg}";
            ErrorMessages.Add(errorMessage);
            output.WriteLine(errorMessage);
        }

        public void SyntaxError(TextWriter output, 
                                IRecognizer recognizer, int offendingSymbol, 
                                int line, int charPositionInLine, 
                                string msg, RecognitionException e)
        {
            HasErrors = true;
            string errorMessage = $"Erro de sintaxe na linha {line}, posição {charPositionInLine}: {msg}";
            ErrorMessages.Add(errorMessage);
            output.WriteLine(errorMessage);
        }
    }
}