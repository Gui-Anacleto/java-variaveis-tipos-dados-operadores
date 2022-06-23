#Aula01 - Conceituação e criação
##Tipos de variaveis:
Instância: Objeto
Classe: classe
Local: dentro de métodos
Parâmetro: Na assinatura do método

#Padrão de definição:
<?visibilidade?> <?modificador?> tipo nome <?=valorinicial?>;

V: "public", "protected" e "private"
M: "static" e "final"
T: tipo de dado
N: nome que é fornecido a variável
VI: um valor inicial, caso se deseje.

##Convenções e regras:

Não devem começar com números;
Embora permitido, "$" e "_" dever ser evitados;
São case-sensitive;
Sem espaços;
Não pode ser as palavras reservadas do java:
abstract, continue, for, new, switch, assert default, goto, package ...

Ex:
int i;  
int I;
**int 1a;** -> Errado
int_1a;
int $aq;
int I = 10;

int final j=10;
int asrn24678md;
**int asrn246 78md;** - Errado
int asrn2$4678_md = 10;
**int asrn2$46%78_md = 10;** - Errado 

##Boas práticas:

Sempre começar com letra miníscula;
Nomes expressivos;
Notação camel - camelo;
Quando constante(final) maiúscula e separada por "_";

Exemplos:

int quantidadeProduto;
**int QuantidadeProduto;** - Errado
int final NUMERO_TENTATIVAS = 5; - Variaveis constantes - Final
**int final numeroTentativas = 5;** - Errado
**int NUMERO_TENTATIVAS = 5;** - Errado
**int qtdProd;** - Errado
int i;

#Aula02-Tipos de dados
##Conceituação:
##Tipificação:
Estatica(forte) vs Dinâmica(fraco)
Primitivo vs Composto

Opções de tipos
Textual:
    char: caracteres de 16-bit unicode -> char c='\u0084'; ou char c='T';
    String: um tipo "especial" -> String s = "T"
Numeral:
    byte: -128 até 127 -> byte b = 12;
    short: -32.768 até 32.767 -> short s = -15785;
    int: -2.147.483.648 até 2.147.483.647 -> int i = 8515785;
    long:: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 -> long l = 5938515785L;
    float: 3..40282347E+38F -> float f = 3.14...(f);
    double: 1.79769313486231570E+308 -> double d = 3.14...(d);
Lógico:
    boolean: true e false -> boolean s = false;
Objeto:
    ...

#Operadores Aritméticos
Tipos:
pós-fixado: exp++ ou exp--
prefixado: ++exp ou --exp
aritmético: +, -, *, / e %
atribuição: =, +=, -=, *=, /= e %=