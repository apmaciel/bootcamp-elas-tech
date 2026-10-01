package org.example.aula8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade_Metodos {
    static void main() {

        mostrarBoasVindas();

        System.out.println(dobro(2));

        System.out.println(Utilidades.calcularMedia(10, 10));

        System.out.println(Utilidades.somar(1, 2));
        System.out.println(Utilidades.somar(1, 2, 3));
        System.out.println(Utilidades.somar(10.0, 22.5));

        Utilidades.saudacao();
        Utilidades.saudacao("Andie");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeDigitada = sc.nextInt();

        if (Utilidades.ehMaiorDeidaade(idadeDigitada)){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de Idade");
        }


    }

    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");

        Utilidades.saudar("Maria");
        Utilidades.saudar("Dulce");
        Utilidades.saudar("Roberta");


    }

    static int dobro(int numero) {
        return numero * 2;
    }
}