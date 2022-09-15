grammar Aickuni;

programa: (comando DELIM) #Programa;
comando: ((declaracao WS*)* ((entradasaida | atribuicao) WS*)* DELIM WS* | (exprcond | exprrepe | funcao) WS*)+ #Comando;
declaracao: TIPO WS* ID #Declaracao;
atribuicao: ATR WS* (NUM | TEXTO | exprarit | exprlogi | exprcomp) A ID WS* #Atribuicao;
entradasaida: ES WS* (ID | NUM | TEXTO | exprarit | exprlogi | exprcomp) #EntradaSaida;
exprarit: (ID | NUM) WS? OPARIT WS? (ID | NUM) WS* #ExprArit;
exprlogi: (ID | BOOL) WS? OPBOOL WS? (ID | BOOL) WS* #ExprLogi;
exprcomp: (ID | NUM) WS? OPREL WS? (ID | NUM) WS* #ExprComp;
exprcond: SE WS* (exprlogi | exprcomp) WS* ENTAO WS* comando (WS* SENAO (exprcond | (comando DELIM)*))* WS* #ExprCond;
exprrepe: ENQUANTO WS* (exprcomp | exprlogi) WS* ABLOCO (comando DELIM)* FBLOCO WS* #ExprRepe;
funcao: FUNCR WS* TIPO WS* TEXTO WS* APAREN WS* ((TIPO TEXTO SEP)* TIPO TEXTO) WS* FPAREN WS* ABLOCO comando* RETORNA (ID | NUM | BOOL | TEXTO | exprarit | exprlogi | exprcomp) FBLOCO WS* | FUNSR WS TEXTO APAREN ((TIPO TEXTO SEP)* TIPO TEXTO) FPAREN WS ABLOCO comando* FBLOCO WS* #Funcao;




fragment LETRA: [a-z A-Z];
fragment DIGITO: [0-9];


OPARIT: 'MAIS'|'MENOS'|'MULT'|'DIVREAL'|'DIVINT'|'RESTO';
OPREL: 'IGUAL'|'MENOR'|'MENORIGUAL'|'MAIOR'|'MAIORIGUAL'|'DIFERENTE';
OPBOOL: 'E'|'OU'|'OUX'|'NAO';
BOOL: 'VERDADEIRO'|'FALSO';
PARA: 'PARA';
ENQUANTO: 'ENQUANTO';
SE: 'SE';
ENTAO: 'ENTAO';
SENAO: 'SENAO';
FUNCR: 'FUNCAORETORNO';
FUNSR: 'FUNCAOSEMRETORNO';
ES: 'LER'|'ESCREVER';
ABLOCO: '{';
FBLOCO: '}';
TIPO: 'REAL'|'INT'|'TEXTO'|'BOOL';
APAREN: '(';
FPAREN: ')';
RETORNA: 'RETORNA';
NUM: '-'?DIGITO+('.'(DIGITO)*)?;
ID: [a-z](LETRA|DIGITO)*;
TEXTO: '"'(LETRA|DIGITO|WS)+'"';
SEP: ',';
ATR: 'ATRIBUI';
DELIM: ';';
A: 'A';
WS: [ \t\n\r]+ -> Skip;