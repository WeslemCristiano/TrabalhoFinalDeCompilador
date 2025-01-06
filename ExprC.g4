grammar ExprC;

// Entrypoint
program : preprocessorDirective* (declaration | functionDeclaration)* mainFunction;

// Diretivas de pré-processamento
preprocessorDirective
    : '#' 'include' '<' HEADER_FILE '>'
    ;

mainFunction
    : 'int' 'main' '(' ')' block
    ;

// Declarações
declaration
    : variableDeclaration
    | statement
    | structDeclaration
    | unionDeclaration
    ;

// Declarações de função
functionDeclaration
    : type IDENTIFIER '(' parameterList? ')' block
    ;

// Lista de parâmetros
parameterList
    : parameter (',' parameter)*
    ;

// Parâmetro
parameter
    : type IDENTIFIER
    ;

// Declaração de variável
variableDeclaration
    : type IDENTIFIER ('[' CONSTANT ']')? ('=' expression)? ';'
    ;

// Declaração de struct
structDeclaration
    : 'struct' IDENTIFIER '{' structMember* '}' ';'
    ;

// Membros de struct
structMember
    : type IDENTIFIER ('[' CONSTANT ']')? ';'
    ;

// Declaração de union
unionDeclaration
    : 'union' IDENTIFIER '{' unionMember* '}' ';'
    ;

// Membros de union
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
    | chamadaStatement ';'
    | returnStatement
    ;

// Expressão de instrução
expressionStatement
    : expression ';'
    ;

// Instruções de printf
printfStatement
    : 'printf' '(' (expression | STRING_LITERAL) (',' expression)* ')' ';'
    ;

// Instruções de scanf
scanfStatement
    : 'scanf' '(' STRING_LITERAL (',' ('&'? IDENTIFIER))* ')' ';'
    ;

// Bloco de instruções
blockStatement
    : '{' statement* '}'
    ;

// Declaração if
ifStatement
    : 'if' '(' expression ')' statement ( 'else' statement )?
    ;

// Declaração switch
switchStatement
    : 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'
    ;

caseStatement
    : 'case' CONSTANT ':' statement*
    ;

defaultStatement
    : 'default' ':' statement*
    ;

// Declaração for
forStatement
    : 'for' '(' expression? ';' expression? ';' expression? ')' statement
    ;

// Declaração while
whileStatement
    : 'while' '(' expression ')' statement
    ;

// Declaração do-while
doWhileStatement
    : 'do' statement 'while' '(' expression ')' ';'
    ;

// Chamada de função
chamadaStatement
    : IDENTIFIER '(' (expression (',' expression)*)? ')'
    ;    

// Declaração return
returnStatement
    : 'return' (expression)? ';'
    ;

// Tipos
type
    : 'int'
    | 'float'
    | 'void'
    | 'char'
    | 'double'
    | 'short'
    | 'long'
    | 'unsigned'
    ;

// Expressões
expression
    : assignmentExpression
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

// Expressões lógicas e
logicalAndExpression
    : equalityExpression ( '&&' equalityExpression )*
    ;

// Expressões de igualdade
equalityExpression
    : relationalExpression ( ( '==' | '!=' ) relationalExpression )*
    ;

// Expressões relacionais
relationalExpression
    : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
    ;

// Expressões aditivas
additiveExpression
    : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
    ;

// Expressões multiplicativas
multiplicativeExpression
    : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
    ;

// Expressões unárias
unaryExpression
    : primaryExpression
    | ('+' | '-' | '!' | '++' | '--') unaryExpression
    ;

// Expressões primárias
primaryExpression
    : IDENTIFIER
    | CONSTANT
    | STRING_LITERAL
    | '(' expression ')'
    |'sizeof' '(' type ')'
    ;

// Tokens
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
CONSTANT   : [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL : '"' (~["\\] | '\\' .)* '"';
HEADER_FILE : [a-zA-Z_][a-zA-Z0-9_]* '.' [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;