package org.example.aula9;

import java.util.Scanner;

public class Atividade_2_Excecao {
    static void main() {

        /*
        2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
        Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
         */

        int [] notas = {5, 7, 9, 10, 1};

        Scanner sc = new  Scanner(System.in);

        System.out.println("Escolha a nota que deseja visualizar: ");
        System.out.println("Nota 1.");
        System.out.println("Nota 2.");
        System.out.println("Nota 3.");
        System.out.println("Nota 4.");
        System.out.println("Nota 5.");

        int posicao = sc.nextInt();

        try {
            System.out.println("A nota é: " + notas[posicao - 1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A escolha vai apenas de 1 - 4");
        }

    }
}
