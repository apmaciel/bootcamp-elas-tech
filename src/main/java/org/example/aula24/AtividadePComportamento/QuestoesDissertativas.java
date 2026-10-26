package org.example.aula24.AtividadePComportamento;

public class QuestoesDissertativas {

    //1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.
    //Resp: O padrão Observer resolve o problema de um objeto precisar avisar vários outros quando o seu estado muda, sem ficar acoplado a eles.
    // Em vez de os interessados ficarem perguntando o tempo todo “mudou?”, eles se cadastram e são avisados automaticamente.
    //  Quem avisa não precisa conhecer cada interessado, só sabe que todos têm um método para receber o aviso, e dá para adicionar ou
    //  remover interessados sem mexer no código de quem avisa.
    //
    //Exemplo: na Shopee, quando o status do meu pedido muda (enviado, saiu para entrega, entregue),
    // eu recebo uma notificação automaticamente, sem precisar ficar abrindo o app para conferir.


    //2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?
    //Subject é quem tem o estado que muda e precisa avisar os outros. Ele guarda uma lista de interessados e oferece métodos para alguém entrar ou sair dessa lista.
    // Na Shopee, é o pedido.
    //
    //Observer é quem quer ser avisado quando o estado muda. Na Shopee, é o cliente (e, mais tarde, o entregador).
    //
    //Como o Subject avisa sem conhecer as classes concretas?
    // Por meio de uma interface. O Subject não guarda uma lista de Cliente ou de Entregador.
    // Ele guarda uma lista do tipo da interface, por exemplo List<Observador>. Toda classe que quer ser avisada implementa essa interface e,
    // por isso, é obrigada a ter o método atualizar(). Quando o estado muda, o Subject percorre a lista chamando atualizar() em cada um.
    // Ele sabe que todo mundo ali tem esse método, mas não sabe nem precisa saber se é um cliente, um entregador ou outra coisa.


    //3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status,
    // o que é preciso alterar na classe Pedido? Por quê?
    //Não é preciso alterar nada na classe Pedido. Basta criar a classe Entregador implementando a interface Observador (com o método atualizar)
    // e adicioná-la à lista com adicionarObservador(). Isso funciona porque o Pedido não depende das classes concretas,
    // só da interface: ele percorre a lista e chama atualizar() em cada observador, sem saber se é cliente, entregador ou qualquer outro.
    // Assim, o sistema fica aberto para receber novos interessados sem precisar mexer no código que já existe (princípio Aberto/Fechado).



}
