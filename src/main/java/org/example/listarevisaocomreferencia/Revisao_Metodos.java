package org.example.listarevisaocomreferencia;

public class Revisao_Metodos {
    static void main() {

        Aonde_Estao_Metodos.mostrarBoasVindas();

        Aonde_Estao_Metodos.saudacao(" Ana");
        Aonde_Estao_Metodos.saudacao(" Roberto");
        Aonde_Estao_Metodos.saudacao(" Juliana");

        System.out.println("\nO dobro de 5 é " + Aonde_Estao_Metodos.dobro(5));

        System.out.printf("Sua média é %.2f " , Aonde_Estao_Metodos.calcularMedia(8.5, 8.0));

        System.out.println("\n" + Aonde_Estao_Metodos.ehPar(3));

        System.out.println("\n" + Aonde_Estao_Metodos.somar(2,5));
        System.out.println("\n" + Aonde_Estao_Metodos.somar(1,2,3));

        Aonde_Estao_Metodos.liberarEntrada(15);
        Aonde_Estao_Metodos.liberarEntrada(18);






    }
}
