package org.example.aula7;

import java.util.Scanner;

public class Atividade_Arrays {
    static void main() {

       /*
       1 — Crie um array com os nomes de 5 pessoas.
       Mostre o primeiro, o terceiro e o último.
        */

       /* String[] nomes = {"Ana", "Beatriz", "Carol", "Deborah"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);   */

/*
2 — Crie um array com as notas {8, 6, 10, 7, 9}.
Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
 */
 /*
3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
 */

        /*int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma = soma + notas[i]; // soma mais notas onde i passou

        }
        media = soma / notas.length; // soma dividido pelo length = total de arrays
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

*/

        /*
        4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
         */

        int [] num = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){

            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();

        }
        for(int i = num.length -1; i >= 0; i-- ){
            System.out.println(num[i]);
        }
    }
}
