package org.example.aula4;

import java.util.Scanner;

public class Exemplo_Scanner {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome? ");
        nome = sc.nextLine(); //para texto

        System.out.println("Seu nome e : " + nome);

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt(); // para n inteiros

        System.out.println("Sua idade e: " + idade);


    }



}

/*
Usar o Scanner -- import - usar

recebe o valor e guardar para exibir

possui muitas maneiras de



 */
