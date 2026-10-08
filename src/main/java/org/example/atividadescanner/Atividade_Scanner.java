package org.example.atividadescanner;

import java.util.Scanner;

public class Atividade_Scanner {
    static void main() {

        /*
        1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
         */

//        int idade;
//        String nome;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite seu nome: ");
//        nome = sc.nextLine();
//        System.out.println("Digite sua idade: ");
//        idade = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Ola " + nome + ", você tem " + idade + " e vai fazer " + (idade + 1) +
//                " no próximo aniversário.");


//        2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

//        int num1;
//        int num2;
//
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Dígite o primeiro número: ");
//        num1 = sc.nextInt();
//        System.out.println("Digite o segundo número: ");
//        num2 = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Soma: " + (num1 + num2) );
//        System.out.println("Subtração: " + (num1 - num2) );
//        System.out.println("Multiplicação: " + (num1 * num2) );
//        System.out.println("Divisão: " + (num1 / num2));
//        System.out.println("Resto: " + (num1 % num2));

//        3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais),
//                ficou de recuperação (entre 5 e 6.9) ou foi reprovada.


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nota 1 : ");
//        double nota1 = sc.nextDouble();
//
//        System.out.println("Nota 2 : ");
//        double nota2 = sc.nextDouble();
//
//        System.out.println("Nota 3 : ");
//        double nota3 = sc.nextDouble();
//
//        double soma = nota1 + nota2 + nota3;
//        double media = soma / 3;
//
//        if (media >= 7.0) {
//            System.out.printf("Sua média é %.2f Aprovado \n" ,media);
//
//        } else if (media <= 5.0 && media >= 6.9) {
//            System.out.printf("Sua média é %.2f Recuperação \n" ,media);
//
//
//        }else{
//            System.out.printf("Sua média é %.2f  Reprovado \n" ,media);
//        }

//        4 - Peça um número e mostre a tabuada dele de 1 a 10.

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para saber sua tabuada: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;

            System.out.println(num + " x " + i + " = " + resultado);

        }
    }
}