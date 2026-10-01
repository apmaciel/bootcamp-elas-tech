package org.example.lista.revisao;

import java.util.Scanner;

public class Atividade_Repeticao_2 {
    static void main() {

        /*
        2 - Faça um programa que use um laço for para contar de 1 até 15.
        Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
        Imprima na tela o número e a palavra correspondente.
        Exemplo de saída:
        "1 é Ímpar"
        "2 é Par"
         */

        Scanner sc = new Scanner(System.in);

        int num;
        int i;

        for (i = 1; i <= 15; i++) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " é Par");
            } else {
                System.out.println(num + " é Ímpar");
            }
        }
    }
}
