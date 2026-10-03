package org.example.aula9;

import java.util.Scanner;

public class Atividade_1_Excecao {

    static void main() {



    /*

    1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
    Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
     */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1° número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite 2° número: ");
        int num2 = sc.nextInt();

        try {

            int resultado = num1 / num2;
            System.out.println(resultado);

        } catch (ArithmeticException ae) {
            System.out.println(" Não se divide por 0");
        }

    }


}
