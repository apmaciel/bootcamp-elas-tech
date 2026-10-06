package org.example.aula9;

import java.util.Scanner;

public class Atividade_5_Excecao {

    static void main() {

        /*
        5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        try {
            int num = sc.nextInt();
            int resto = 100 % num;

            System.out.printf("O resto da divisão é %.2f : " , resto);


        }catch (ArithmeticException e){
            System.out.println("Não se divide por 0");
        }
    }
}
