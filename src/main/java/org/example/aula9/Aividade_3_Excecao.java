package org.example.aula9;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Aividade_3_Excecao {

    static void main() {

        /*
        3 — Peça a idade da pessoa com scanner.nextInt().
        Se ela digitar um texto em vez de um número, trate a InputMismatchException
        e mostre uma mensagem pedindo um número.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");


        try {
            int idade = sc.nextInt();
            System.out.println("Sua idade é : " + idade);

        }catch (InputMismatchException e){

            System.out.println("Digite em número não pode texto");
        }
    }
}
