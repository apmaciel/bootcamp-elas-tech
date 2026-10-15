package org.example.segundalistarevisaocomreferencia;

public class Revisao_Concatenacao_Printf {

    static void main() {

        int idade = 28;
        String nome = "Ana";

        System.out.println(nome + " tem " + idade + " anos");

        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1+nota2) / 2;

        System.out.printf("A média é: %.2f", media);

        double preco = 40.00;

        System.out.printf("O valor do produto é $ %.2f", preco);

////        int idade = 45;
////        double altura = 1.70;
////        String nome = "Joseli da Silva";
//
//        System.out.printf("Nome %s, tem %d idade e %.2f de altura", nome, idade, altura);


        double total = 0;
        String prod1 = "Batata";
        String prod2 = "Arroz";
        String prod3 = "Cafe";

        double batata = 3.50;
        double arroz = 5.50;
        double cafe = 4.60;

        System.out.printf("\n%s --- custa %.2f", prod1, batata);
        System.out.printf("\n%s --- custa %.2f", prod2, arroz);
        System.out.printf("\n%s --- custa %.2f", prod3, cafe);

        total = batata + arroz + cafe;

        System.out.printf("\nO total : %.2f", total);






    }
}
