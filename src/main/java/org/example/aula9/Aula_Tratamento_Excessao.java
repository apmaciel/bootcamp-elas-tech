package org.example.aula9;

public class Aula_Tratamento_Excessao {
    static void main(String[] args) {


        try {

            int resultado = 10 / 2;
            System.out.println(resultado);

        } catch (ArithmeticException ae) {
            System.out.println(" Não se divide por 0");
        }finally {
            System.out.println("isso sempre roda");
        }
        System.out.println("o programa continua rodando");
        }
    }
