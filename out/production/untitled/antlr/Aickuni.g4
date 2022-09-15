grammar Aickuni;

@header{
    package antlr;
}


programa: (comando DELIM) #NPrograma;
comando: ((declaracao WS*)* ((ler | escrever | atribuicao) WS*)* DELIM WS* | (exprcond | exprrepe | funcao) WS*)+ #NComando;
declaracao: TIPO WS* ID #NDeclaracao;
atribuicao: ATR WS* (NUM | TEXTO | exprarit | exprlogi | exprcomp) A ID WS* #NAtribuicao;

ler: LER WS* (ID | NUM | TEXTO) #NLer;
escrever: ESCREVER WS* (ID | NUM | TEXTO | exprarit | exprlogi | exprcomp) #NEscrever;

exprarit: (ID | NUM) WS? OPARIT WS? (ID | NUM) WS* #NExprArit;
exprlogi: (ID | BOOL) WS? OPBOOL WS? (ID | BOOL) WS* #NExprLogi;
exprcomp: (ID | NUM) WS? OPREL WS? (ID | NUM) WS* #NExprComp;
exprcond: SE WS* (exprlogi | exprcomp) WS* ENTAO WS* comando (WS* SENAO (exprcond | (comando DELIM)*))* WS* #NExprCond;
exprrepe: ENQUANTO WS* (exprcomp | exprlogi) WS* ABLOCO (comando DELIM)* FBLOCO WS* #NExprRepe;
funcao: FUNCR WS* TIPO WS* TEXTO WS* APAREN WS* ((TIPO TEXTO SEP)* (TIPO TEXTO)?) WS* FPAREN WS* ABLOCO comando* RETORNA (ID | NUM | BOOL | TEXTO | exprarit | exprlogi | exprcomp) FBLOCO WS* #NFuncaor| FUNSR WS TEXTO APAREN ((TIPO TEXTO SEP)* (TIPO TEXTO)?) FPAREN WS ABLOCO comando* FBLOCO WS* #NFuncao;




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
LER: 'LER';
ESCREVER: 'ESCREVER';
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