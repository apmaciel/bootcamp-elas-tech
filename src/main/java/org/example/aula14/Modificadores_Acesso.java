package org.example.aula14;

public class Modificadores_Acesso {
}

/*
Latex --> overleat -- faz arquivo com código a IA faz currícculos

Assunto :

4 níveis de Modificação de controle :

1 - private
ex : pivate int num;
privado - acessa somente dentro do mesmo arquivo.

proteger atributos

2- default
 sem nada na frente da variavavel
visível apenas no mesmo pacote.


3- protected
ex: protected int num;
acesso dentro do mesmo pacote, apenas filhas.
outros pacotes não. filhas de pacotes não enxergam.


4- public
acessa de todos os lugares

Pilares -->

herança : herdam da classe de alguém

Polimorfismo: você ter coisas com o mesmo nome que faz outras coisas
mesma ordem e nome

dinamico = diferentes no parametros
statico = iguais

Encapsulamento :
quem pode mexer no quê
modificados e acessados por metodos.
é esconder os detalhes, e expor os necessarários em metodos públicos.
O dado fica fechado, e o acesso passa pelos métodos que você escolher,
onde dá pra conferir antes de aceitar.

como acessar o metodo:
Você pode encapsula atributos,
Encapsular atributos é proteger o estado.
Encapsular métodos e classes é proteger o comportamento e a complexidade

Tenho médoto processarPagamento() chama dentro dele:
*ValidarFraude();
conectarOperadores();
debitarCartao();
emitirNotaFiscal();

Por isso todos ficam privados, com exeção ao processarPagamentp()

exemplo com atributo:

saldo --> sempre privado;

Abstração :

.this --> é uma palavra com uma referência para o objetivo para
o objeto atual que está executando o método ou construtor.

ex :

  int


  Construtor --> vai roda na hora que você usa new:

  ele tem o mesmo nome da classe
  nao tem retorno é vazio
  serve para preencher o objeto no nascimento
  é equivalente a criar uma variável preenchendo ela.
  como int i = 0;
  serve para iniciar o obejto.
  é a garantia: todo objeto dessa

  comando para criar :  alt + insert  ou gener

get e set -->

são os métodos que abrem as portas do jeito que você escolhe

getter ---> devolve o valor - get
setter ---> mudar o valor - set

são métodos comuns, com parêmetro e retorno. Nada novo.
 */
