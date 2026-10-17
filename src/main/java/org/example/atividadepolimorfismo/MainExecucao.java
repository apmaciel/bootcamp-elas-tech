package org.example.atividadepolimorfismo;

public class MainExecucao {
    static void main() {

        Calculadora calcu = new Calculadora();

        System.out.println("Área do quadrado: " + calcu.calcularArea(5.0));
        System.out.println("Área do retângulo: " + calcu.calcularArea(4.0, 6.0));
        System.out.printf("Área do círcula: %.2f  " ,calcu.calcularArea(3));
        System.out.println(" ");

        //--------------------------------------------------//

        Painel painel = new Painel();

        painel.exibir("Olá");
        painel.exibir(10);
        painel.exibir(true);
        painel.exibir(2.4);
        System.out.println(" ");

        //--------------------------------------------------------//

        Professora prof = new Professora();
        prof.nome = "Flora";
        prof.idade = 30;
        prof.disciplina = "Java";
        prof.profissao = "professora";
        prof.lancarNota("Ana", 8.0);
        System.out.println("\n");
        prof.apresentar("Professora de Java");

        Aluna aluna = new Aluna();

        aluna.nome = "Ana";
        aluna.idade = 12;
        aluna.profissao = "aluna";
        aluna.souAluna(5.0);
        System.out.println("\n");

        Pessoa estagi = new Estagiaria();

        estagi.nome = "Bia";
        estagi.idade = 20;
        estagi.profissao = "estagiária";
        estagi.apresentar();
        System.out.println("\n");

        mostrarFicha(prof);
        mostrarFicha(aluna);
        mostrarFicha(estagi);




    }
    static void mostrarFicha(Pessoa p){
        p.apresentar();


    }

    /*
    Para que serve o @Override

O @Override é um aviso de intenção. Você diz ao Java: “eu quero sobrescrever um método da mãe, confira para mim”.
Se a assinatura estiver errada (parâmetro diferente,
nome com erro de digitação como apresenta()), ele acusa o erro na hora, em vez de deixar o bug passar em silêncio.

Por isso a recomendação é: sempre que for sobrescrever, coloque o @Override.

Para terminar o exercício, volte o método da Professora para a versão sem parâmetro,
com o @Override, para que o mostrarFicha funcione de novo como antes.
     */




}
