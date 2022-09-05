grammar Aickuni;

programa: (comando DELIM);
comando: ((declaracao WS*)* ((entradasaida | atribuicao) WS*)* DELIM WS* | (exprcond | exprrepe | funcao) WS*)+;
declaracao: TIPO WS* ID;
atribuicao: ATR WS* (NUM | TEXTO | exprarit | exprlogi | exprcomp) A ID WS*;
entradasaida: ES WS* (ID | NUM | TEXTO | exprarit | exprlogi | exprcomp);
exprarit: (ID | NUM) WS? OPARIT WS? (ID | NUM) WS*;
exprlogi: (ID | BOOL) WS? OPBOOL WS? (ID | BOOL) WS*;
exprcomp: (ID | NUM) WS? OPREL WS? (ID | NUM) WS*;
exprcond: SE WS* (exprlogi | exprcomp) WS* ENTAO WS* comando (WS* SENAO (exprcond | (comando DELIM)*))* WS*;
exprrepe: ENQUANTO WS* (exprcomp | exprlogi) WS* ABLOCO (comando DELIM)* FBLOCO WS*;
funcao: FUNCR WS* TIPO WS* TEXTO WS* APAREN WS* (TEXTO SEP)* WS* FPAREN WS* ABLOCO comando* RETORNA (ID | NUM | BOOL | TEXTO | exprarit | exprlogi | exprcomp) FBLOCO WS* | FUNCSR WS TEXTO APAREN (TEXTO SEP)* FPAREN WS ABLOCO comando* FBLOCO WS*;




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