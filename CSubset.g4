grammar CSubset;

// Programa básico que aceita múltiplas declarações e expressões
program : statement+ ;

statement
    : varDeclaration ';'                // Declaração de variáveis
    | expr ';'                          // Expressão
    | functionDeclaration               // Declaração de funções
    | controlStructure                  // Estruturas de controle
    | ioFunction ';'                    // Entrada e saída
    ;

varDeclaration
    : typeSpecifier varDeclarator (',' varDeclarator)* // Declaração de múltiplas variáveis
    ;

varDeclarator
    : '*'? IDENTIFIER ('=' expr)?       // Suporte para ponteiros e inicialização
    | IDENTIFIER '[' DIGIT ']'          // Arrays
    ;

typeSpecifier
    : 'int' | 'float' | 'char' | 'void' // Tipos primitivos e void
    ;

// Expressões que suportam operadores aritméticos, relacionais e lógicos
expr
    : expr ('+' | '-' | '*' | '/' | '%') expr               // Operadores aritméticos
    | expr ('==' | '!=' | '<' | '>' | '<=' | '>=') expr     // Comparação
    | expr ('&&' | '||') expr                               // Operadores lógicos
    | '(' expr ')'                                          // Parênteses
    | IDENTIFIER                                            // Identificador (variável ou função)
    | IDENTIFIER '[' expr ']'                               // Acesso a array
    | NUMBER                                                // Constantes numéricas
    | STRING                                                // Constantes de string
    ;

// Estruturas de controle como if, while, for, switch
controlStructure
    : ifStatement
    | whileStatement
    | forStatement
    | doWhileStatement
    | switchStatement
    ;

ifStatement
    : 'if' '(' expr ')' '{' statement+ '}' ('else' '{' statement+ '}')?
    ;

whileStatement
    : 'while' '(' expr ')' '{' statement+ '}'
    ;


forStatement
    : 'for' '(' varDeclaration? expr? ';' expr? ')' statement
    ;


doWhileStatement
    : 'do' '{' statement+ '}' 'while' '(' expr ')' ';'
    ;

switchStatement
    : 'switch' '(' IDENTIFIER ')' '{' caseBlock+ '}'
    ;

caseBlock
    : 'case' NUMBER ':' statement+ 'break' ';'
    | 'default' ':' statement+ 'break' ';'
    ;

// Funções e listas de parâmetros
functionDeclaration
    : typeSpecifier IDENTIFIER '(' parameterList? ')' '{' statement+ '}'
    ;

parameterList
    : typeSpecifier IDENTIFIER (',' typeSpecifier IDENTIFIER)*
    ;

// Funções de entrada e saída (printf, scanf)
ioFunction
    : 'printf' '(' STRING (',' IDENTIFIER)* ')'
    | 'scanf' '(' STRING ',' '&' IDENTIFIER ')'
    ;

// Manipulação de ponteiros e operadores de acesso
pointerManipulation
    : '*' IDENTIFIER '=' expr         // Modifica o valor apontado por um ponteiro
    | IDENTIFIER '=' '&' IDENTIFIER   // Atribui o endereço de uma variável a um ponteiro
    ;

// Declarações de estruturas e unions
structDeclaration
    : 'struct' IDENTIFIER '{' varDeclaration* '}' ';'
    ;

unionDeclaration
    : 'union' IDENTIFIER '{' varDeclaration* '}' ';'
    ;

// Diretivas do pré-processador
preprocessorDirective
    : '#include' '<' IDENTIFIER '>'
    | '#define' IDENTIFIER expr
    ;

// Tokens e símbolos
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER     : [0-9]+ ('.' [0-9]+)? ; // Para inteiros e flutuantes
STRING     : '"' .*? '"' ;
DIGIT      : [0-9]+ ;
WS         : [ \t\r\n]+ -> skip ;   // Ignorar espaços em branco
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
