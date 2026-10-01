package org.example.aula3;

public class Atividade_Operadores_Relacionais {

    static void main() {

        /*
        1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de:
        são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:

          a = 10,  b = 3
          a = 3,    b = 10
          a = 5,    b = 5

         */

        double a = 10, a2 = 3, a3 = 5;
        double b = 3, b2= 10, b3= 5;

        System.out.println("a é igual b = " + (a == b) );
        System.out.println("a diferente b = " + (a != b));
        System.out.println("a é maior que b = " + ( a > b));
        System.out.println("a é menor que b = " + ( a < b));
        System.out.println("\n");

        System.out.println("a é igual b = " + (a2 == b2) );
        System.out.println("a diferente b = " + (a2 != b2));
        System.out.println("a é maior que b = " + ( a2 > b2));
        System.out.println("a é menor que b = " + ( a2 < b2));
        System.out.println("\n");


        System.out.println("a é igual b = " + (a3 == b3) );
        System.out.println("a diferente b = " + (a3 != b3));
        System.out.println("a é maior que b = " + ( a3 > b3));
        System.out.println("a é menor que b = " + ( a3 < b3));
        System.out.println("\n");

        /*
        2- Exiba na tela  a == b, sendo a = 10 e b 3.
         */
/*
        int a = 10;
        int b = 3;

        System.out.println(a==b);

        */

       // 3- Exiba na tela a != b, sendo a = 10 e b = 3.

         //  int a = 10, b = 3;
        //  System.out.println(a != b);

        /*
        4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
         */

       // boolean chovendo = true;
       // System.out.println(chovendo != chovendo);
    }
}
