package org.example.aula18.bebe;

public class Bebe {

    //Apreendendo construtor da propria classe

    String nome;
    String dataNascimento;

    public Bebe(String nomeBebe, String dataNascimentoBebe){
//        //padrão se nomes iguais usar this, se não, não precisa
//        this.nome = nomeBebe;
//        this.dataNascimento = dataNascimentoBebe;

        nome = nomeBebe;
        dataNascimento = dataNascimentoBebe;
    }
}
