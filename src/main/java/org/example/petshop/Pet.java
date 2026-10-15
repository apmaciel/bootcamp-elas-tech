package org.example.petshop;

public class Pet {
    String nome;       //dados dos Pets para armazena
    String especie;
    double peso;
    String porte;

    //criando o método de validação de porte

     String definirPorte(){

        if (peso >= 25){
           return porte = "Grande";
        } else if (peso > 10) {
           return porte = "Médio";
        }else {
          return porte = "Pequeno";
        }
    }

    void emitirSom(){
        System.out.println(nome + "faz som.");
    }
}
