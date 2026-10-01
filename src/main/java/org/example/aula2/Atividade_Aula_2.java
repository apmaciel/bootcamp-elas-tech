package org.example.aula2;

public class Atividade_Aula_2 {
    static void main() {


        // 1- Crie variáveis para um nome, uma cidade e uma idade.
        // Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");

        /*
        2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4).
         Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

         */

        System.out.println("Comprei " + quantidade + " unidades de " +
                produto + " por R$ " + preco + " cada. Total: R$ " + (preco * quantidade));

    /*
    3- Crie duas variáveis com números inteiros.
    Mostre a soma em uma frase completa, assim:
     "A soma de 15 e 4 é igual a 19."
     */
        int A = 15;
        int B = 4;
        int soma = A + B;

        System.out.println("A soma de 15 e 4 é igual a : " + soma);
    }
}
