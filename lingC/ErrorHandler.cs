using System;
using System.Collections.Generic;

namespace lingC
{
    public class ErrorHandler
    {
        private List<string> errors = new List<string>();

        public void AddError(string message)
        {
            errors.Add(message);
        }

        public void PrintErrors()
        {
            if (errors.Count > 0)
            {
                Console.WriteLine("Erros encontrados:");
                foreach (var error in errors)
                {
                    Console.WriteLine(error);
                }
            }
            else
            {
                Console.WriteLine("Nenhum erro encontrado.");
            }
        }

        public bool HasErrors()
        {
            return errors.Count > 0;
        }
    }
}