package org.example.aula9;

public class Atividade_4_Excessao {
    static void main() {

        /*
        4 — Crie uma variável String nome = null;
        e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
         */

        String nome = null;

        try {

            System.out.println(nome.length());

        } catch (NullPointerException e) {

            System.out.println("O nome não foi preenchido.");
        }
    }
}


