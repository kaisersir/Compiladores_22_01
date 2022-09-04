grammar Aickuni;

programa: (comando DELIM)+;
comando: declaracao* (entradasaida | atribuicao) DELIM | (exprcond | exprrepe | funcao);
declaracao: TIPO WS ID;
atribuicao: ATR WS (NUM | TEXTO | exprarit | exprlogi | exprcomp) A ID;
entradasaida: ES WS (ID | NUM | TEXTO | exprarit | exprlogi | exprcomp);
exprarit: (ID | NUM) WS? OPARIT WS? (ID | NUM);
exprlogi: (ID | BOOL) WS? OPBOOL WS? (ID | BOOL);
exprcomp: (ID | NUM) WS? OPREL WS? (ID | NUM);
exprcond: SE WS (exprlogi | exprcomp) WS ENTAO WS comando (WS SENAO (exprcond | (comando DELIM)*))*;
exprrepe: ENQUANTO WS (exprcomp | exprlogi) WS ABLOCO (comando DELIM)* FBLOCO;
funcao: FUNC WS TIPO WS WS TEXTO APAREN (TEXTO SEP)* FPAREN WS ABLOCO comando* RETORNA (ID | NUM | BOOL | TEXTO | exprarit | exprlogi | exprcomp) FBLOCO | FUNC WS TEXTO APAREN (TEXTO SEP)* FPAREN WS ABLOCO comando* FBLOCO;




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
FUNC: 'FUNCAORETORNO'|'FUNCAOSEMRETORNO';
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