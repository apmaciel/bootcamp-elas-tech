package org.example.segundalistarevisaocomreferencia;

public class Revisao_Classes_Objetos {
    static void main() {

        // - tem a classe Pet
        // - tem a classe Produto
        // - tem a classe aluna
        // - tem a classe jogadora

        Pet novoPet1 = new Pet();

        novoPet1.nome = "Jacob";
        novoPet1.raca = "Border Collie";
        novoPet1.peso = 30.0;

        Pet novoPet2 =  new Pet();

        novoPet2.nome = "Maria";
        novoPet2.raca = "Pitbull";
        novoPet2.peso = 20.0;

        System.out.println("O nome do seu pet é : " + novoPet1.nome +
                " de raça " + novoPet1.raca + ", e pesa " + novoPet1.peso + "kg");

        System.out.println("\nO nome do seu pet é : " + novoPet2.nome +
                " de raça " + novoPet2.raca + ", e pesa " + novoPet2.peso + "kg");


       Produto prod = new Produto();
       prod.nomeProd = "Amaciante";
       prod.precoProd = 1.99;
       prod.qtdProd = 100;

        System.out.println("\nO Produto " + prod.nomeProd + " tem valor total de estoque : " + (prod.qtdProd * prod.precoProd) + "R$");


        Aluna novaAluna = new Aluna();
        novaAluna.nomealuna = "Ana Maria";
        novaAluna.nota1 = 7.0;
        novaAluna.nota2 = 8.0;
        novaAluna.media = (novaAluna.nota1 + novaAluna.nota2) / 2;

        System.out.println("\nA aluna " + novaAluna.nomealuna + " tem média " + novaAluna.media);

        Jogadora jodadora1 = new Jogadora();
        Jogadora jogadora2 = new Jogadora();
        Jogadora jogadora3 = new Jogadora();

        jodadora1.nomeJogadora = "Jessica";
        jodadora1.pontoJogadora = 200;

        jogadora2.nomeJogadora = "Janine";
        jogadora2.pontoJogadora = 300;

        jogadora3.nomeJogadora = "Jane";
        jogadora3.pontoJogadora = 99;

        int maiorPonto = jodadora1.pontoJogadora;
        String nomeCampea = jodadora1.nomeJogadora;

        if(jogadora2.pontoJogadora > maiorPonto){

            maiorPonto = jogadora2.pontoJogadora;
            nomeCampea = jogadora2.nomeJogadora;
        }
        if (jogadora3.pontoJogadora > maiorPonto){

            maiorPonto = jogadora3.pontoJogadora;
            nomeCampea = jogadora3.nomeJogadora;
        }

        System.out.println("A jogadora " + nomeCampea + " com maior pontos XP de: " + maiorPonto );

    }
}
