package org.example.listarevisaocomreferencia;

public class Aonde_Estao_Metodos {

    static void mostrarBoasVindas() {
        System.out.println("Seja bem-vindo");
    }

    static void saudacao(String nome) {
        System.out.println("Óla," + nome);
    }

    static int dobro(int num) {

        int resultado = num + num;

        return resultado;
    }

    static double calcularMedia(double n1, double n2) {
        double resultado = (n1 + n2) / 2;

        return resultado;
    }

    static boolean ehPar(int numero) {
        if (numero % 2 == 0){

            return true;
        }else {
            return false;
        }

    }

    static int somar(int num1, int num2){
        int resul = num1 + num2;

        return resul;
    }
    static int somar(int num1, int num2, int num3){
        int resul = num1 + num2 + num3;

        return resul;
    }

    static boolean ehMaiorDeIdade(int idade){
        if (idade >= 18){
            return true;
        }else {
            return false;
        }
    }

    static void liberarEntrada(int idade){
        if (ehMaiorDeIdade(idade)){
            System.out.println("Idade " + idade + " entrada liberada.");
        }else {
            System.out.println("Idade " + idade + " entrada negada.");
        }
    }



}
