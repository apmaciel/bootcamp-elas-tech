package org.example.aula8;

public class Utilidades {

    static void saudar(String nome) {

        System.out.println("Ola " + nome + "! Tudo bem?");

    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;

    }

    static boolean ehMaiorDeidaade(int idade) {

    return idade >18;
    }
    static int somar(int num1, int num2){
        return  num1 + num2;
    }
    static  int somar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    static double somar(double num1, double num2){
        return num1 + num2;
    }

    static void saudacao(){
        System.out.println("Ola");
    }
    static void saudacao(String nome){
        System.out.println("Ola " + nome);
    }



}
