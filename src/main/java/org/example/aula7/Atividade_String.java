package org.example.aula7;

import java.util.Scanner;

public class Atividade_String {
    static void main() {

        String nome;
        Scanner sc = new Scanner(System.in);

     /*   System.out.println("Digite seu nome :");
        nome = sc.nextLine();
        System.out.println("Seu nome possui " + nome.length() + " letras");

      */

      /*  System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

       */
/*
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("A primeira letra do seu nome e: " + nome.charAt(0));
      */

        /*
        String frase;
        String palavra;
        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();
        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

*/


        String nome1;
        String nome2;
        System.out.println("Digite seu nome: ");
        nome1 = sc.nextLine();
        System.out.println("Digite de novo: ");
        nome2 = sc.nextLine();
        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));


    }
}
