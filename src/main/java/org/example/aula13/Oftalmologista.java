package org.example.aula13;

public class Oftalmologista extends Medico {

    void examinaOlho(){

    }

    void passaOculos(){

    }

    void fazerCirurgia(){
        System.out.println("Cortar o olho");
    }

    static int soma(int numero1, int numero2){
        return numero1+numero2;
    }

    static double soma(double numero1, double numero2){
        return 0.0;
    }
}

//override --> é 100% igual

//overload --> mesma classe e nome mas com parametros diferentes
