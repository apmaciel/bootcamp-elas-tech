package org.example.listarevisaocomreferencia;

import java.sql.SQLOutput;

public class Revisao_Variaveis_Tipos {

    static void main() {



        String nome = "Ana";
        int idade = 28;
        String cidade = "Salvador";
        double altura = 1.73;
        boolean programou = true;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(cidade);
        System.out.println(programou);

        System.out.println("\nEu moro em " + cidade);

        String firstname = "Joana";
        String lastname = "Maciel";

        System.out.println(firstname + " " +  lastname);

        double preco = 29.90;

        System.out.printf("O preço desse xampoo é $ %.2f  " , preco);

        boolean temCarteira = true;

        System.out.println("\n" + temCarteira);


        int a = 10;

        int b = 20;

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);


    }
}
