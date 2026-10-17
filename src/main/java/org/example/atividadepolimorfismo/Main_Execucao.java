package org.example.atividadepolimorfismo;

public class Main_Execucao {
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


}
