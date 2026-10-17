package org.example.atividadepolimorfismo;

public class Painel {

    void  exibir(String texto ){
    System.out.println("\nRecebi um String: " + texto);

    }

    void exibir(int numero){
        System.out.println("Recebi um número: " + numero);
    }

    void exibir(boolean objeto){
        System.out.println("Recebi um valor: " + objeto );

    }

    void exibir(double decimal){
        System.out.println("Recebi um objeto: " + decimal);
    }
}
