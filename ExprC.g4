grammar ExprC;

// Entrypoint
program : preprocessorDirective* (declaration | statement)* EOF;

// Diretivas de pré-processamento
preprocessorDirective
    : '#' 'include' '<' HEADER_FILE '>'
    | '#' 'define' IDENTIFIER (CONSTANT | expression)?
    ;

// Declarações
declaration
    : functionDeclaration
    | variableDeclaration
    | structDeclaration
    | unionDeclaration
    ;

// Declarações de função
functionDeclaration
    : type IDENTIFIER '(' parameterList? ')' block
    | 'void' IDENTIFIER '(' parameterList? ')' block
    | 'int' 'main' '(' parameterList? ')' block
    ;

// Lista de parâmetros com suporte a arrays
parameterList
    : parameter (',' parameter)*
    ;

parameter
    : type IDENTIFIER ('[' ']')?
    ;

// Declaração de variável com suporte a vetores e inicialização
variableDeclaration
    : type IDENTIFIER ('[' CONSTANT ']')? ('=' arrayInitializer | '=' expression)? ';'
    ;

// Inicializador de array
arrayInitializer
    : '{' expression (',' expression)* '}'
    ;

// Declaração de struct e union
structDeclaration
    : 'struct' IDENTIFIER '{' structMember* '}' ';'
    ;

unionDeclaration
    : 'union' IDENTIFIER '{' unionMember* '}' ';'
    ;

structMember
    : type IDENTIFIER ('[' CONSTANT ']')? ';'
    ;

unionMember
    : type IDENTIFIER ('[' CONSTANT ']')? ';'
    ;

// Bloco de código
block
    : '{' statement* '}'
    ;

// Instruções
statement
    : expressionStatement
    | blockStatement
    | ifStatement
    | returnStatement
    | variableDeclaration
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    | scanfStatement
    | printfStatement
    ;

// Expressão de instrução
expressionStatement
    : expression ';'
    ;

// Instruções de printf e scanf com múltiplos argumentos
printfStatement
    : 'printf' '(' STRING_LITERAL (',' expression)* ')' ';'
    ;

scanfStatement
    : 'scanf' '(' STRING_LITERAL (',' '&' IDENTIFIER)* ')' ';'
    ;

// Declarações de bloco, controle e laços
blockStatement
    : '{' statement* '}'
    ;

ifStatement
    : 'if' '(' expression ')' statement ( 'else' statement )?
    ;

switchStatement
    : 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'
    ;

caseStatement
    : 'case' CONSTANT ':' statement*
    ;

defaultStatement
    : 'default' ':' statement*
    ;

forStatement
    : 'for' '(' expression? ';' expression? ';' expression? ')' statement
    ;

whileStatement
    : 'while' '(' expression ')' statement
    ;

doWhileStatement
    : 'do' statement 'while' '(' expression ')' ';'
    ;

returnStatement
    : 'return' expression? ';'
    ;

// Tipos com suporte a ponteiros e qualificadores de tipo
type
    : ('int' | 'float' | 'void' | 'char' | 'double' | 'short' | 'long' | 'unsigned') ('*')*
    ;

// Expressões
expression
    : assignmentExpression
    ;

// Expressão condicional (operador ternário)
conditionalExpression
    : logicalOrExpression ('?' expression ':' expression)?
    ;

// Expressões de atribuição
assignmentExpression
    : IDENTIFIER '=' logicalOrExpression
    | logicalOrExpression
    ;

// Expressões lógicas
logicalOrExpression
    : logicalAndExpression ( '||' logicalAndExpression )*
    ;

logicalAndExpression
    : equalityExpression ( '&&' equalityExpression )*
    ;

equalityExpression
    : relationalExpression ( ( '==' | '!=' ) relationalExpression )*
    ;

relationalExpression
    : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
    ;

additiveExpression
    : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
    ;

// Expressões unárias com casting e ponteiros
unaryExpression
    : '(' type ')' unaryExpression
    | primaryExpression
    | ('+' | '-' | '!' | '++' | '--' | '*' | '&') unaryExpression
    ;

// Expressões primárias
primaryExpression
    : IDENTIFIER
    | CONSTANT
    | STRING_LITERAL
    | '(' expression ')'
    | 'sizeof' '(' type ')'
    | functionCall
    ;

// Chamadas de função com lista de argumentos
functionCall
    : IDENTIFIER '(' argumentList? ')'
    ;

argumentList
    : expression (',' expression)*
    ;

// Tokens
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
CONSTANT   : [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL : '"' (~["\\] | '\\' .)* '"';
HEADER_FILE : [a-zA-Z_][a-zA-Z0-9_]* '.' [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;