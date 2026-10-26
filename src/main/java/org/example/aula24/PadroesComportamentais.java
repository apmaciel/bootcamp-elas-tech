package org.example.aula24;

public class PadroesComportamentais {

}

/*

Como os objetos conversam e dividem tarefas: Já vimos como os
objetos CRIAÇÃO -nascem e como eles se conectam ESTRUTURAIS.

Agora os padrões comportamentais foam na comunicação, no fluxo
de trabalho e na divisão de responsabilidades entre os  objetos
quando o sistema já está rodando.



Observer - >
Ele permite um objeto avise automaticamente uma lista de outros
objetos interessados sempre que o seu estado mudar.

é um sistema de notificação.

Um objeto(o sujeito) mantém uma lista de interessados (os observadores),
e avisa todos eles automaticamente quando algo mudo nele.
Quem muda não precisa saber quem está ouvindo nem o que cada
vai fazer com a notícia.

Conecta com o SOLID segue o O(Aberto/Fechado) e o D ( Inversão)

Errado - Sem observar - Quando um pedido é aprovado,
a própria

Vantagens : baixo acoplamento,

Quando usar: se X muda, preciso avisar, ABC automaticamente,
Se uma mudança

3 Peças:

Obsever
Subject --> Sujeito tem o estado -- guarda a lista, inscrever, desiscrever
e notificar.

Observers concretos: as classes que implementam a interface
e reagem do seu jeito.






Strategy - >

 */