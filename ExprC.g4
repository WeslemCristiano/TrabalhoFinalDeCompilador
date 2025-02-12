grammar ExprC;

// Entrypoint
program : preprocessorDirective* (declaration | functionDeclaration)* mainFunction;

// Diretivas de pré-processamento
preprocessorDirective
    : '#' 'include' '<' 'stdio.h' '>'
    ;

// Definição constante de pré-processamento
defineDirective
    : '#' 'define' IDENTIFIER CONSTANT
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
    | defineDirective
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
    : type variableDeclarator (',' variableDeclarator)* ';'
    ;

// Declarador de variável
variableDeclarator
    : IDENTIFIER ('[' CONSTANT ']')* ('=' expression)?
    | '*' IDENTIFIER ('[' CONSTANT ']')* ('=' expression)?
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
    | pointerDeclaration
    | ternaryExpression
    | arrayDeclaration
    | matrixDeclaration
    | getsStatement
    | putsStatement
    ;

// Expressão de instrução
expressionStatement
    : expression ';' | expression '.' IDENTIFIER '=' expression ';'
    ;

//Instruções de gets
getsStatement
    : 'gets' '(' IDENTIFIER ')' ';'
    ;

 //Instruções de puts
putsStatement
    : 'puts' '(' (expression | STRING_LITERAL) ')' ';'
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
    : 'case' CONSTANT ':' statement* 'break' ';'
    ;

defaultStatement
    : 'default' ':' statement*
    ;
    

// Declaração for
forStatement
    : 'for' '(' (variableDeclaration | expression)? ';' expression? ';' expression? ')' statement
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
    : 'return' expression? ';'
    ;

// Declaração de ponteiro
pointerDeclaration
     // int *p = &x;
    : type '*' IDENTIFIER ('=' '&' IDENTIFIER)? ';'
    ;


// Expressões ternárias
ternaryExpression
    : logicalOrExpression '?' statement ':' statement
    ;

// Declaração de array    
arrayDeclaration
    : type IDENTIFIER '[' CONSTANT ']' ('=' '{' (expression (',' expression)*)? '}')? ';'
    ; 

// Declaração de matriz
matrixDeclaration
    : type IDENTIFIER '[' CONSTANT ']' '[' CONSTANT ']' ('=' '{' (arrayInitializer (',' arrayInitializer)*)? '}')? ';'
    ;

arrayInitializer
    : '{' expression (',' expression)* '}'
    ;


// Tipos
type
    : 'int'
    | 'float'
    | 'double'
    | 'long double'
    | 'char'
    | 'short'
    | 'long'
    | 'unsigned'
    | 'unsigned char'
    | 'unsigned int'
    | 'unsigned short'
    | 'unsigned long'
    | 'long long'
    | 'unsigned long long'
    | 'struct' IDENTIFIER
    | 'union' IDENTIFIER
    | 'void'
    ;

// Expressões
expression
    : assignmentExpression
    | ternaryExpression
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
    | ('+' | '-' | '!' | '++' | '--' | '&' | '*') unaryExpression
    ;

// Expressões primárias
primaryExpression
    : '(' expression ')'
    | IDENTIFIER ('[' expression ']')*
    | expressionStruct
    | CONSTANT
    | STRING_LITERAL
    ;

// Expressão de acesso a membros de struct
expressionStruct
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

// Tokens
CONSTANT: INT | FLOAT | CHAR;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
CHAR: '\'' . '\'';
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
STRING_LITERAL : '"' (~["\\] | '\\' .)* '"';
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/'  -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;