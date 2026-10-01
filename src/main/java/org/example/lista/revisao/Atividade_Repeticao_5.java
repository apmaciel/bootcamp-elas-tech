package org.example.lista.revisao;

import java.util.Scanner;

public class Atividade_Repeticao_5 {
    static void main() {

        /*

5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).

Na classe principal, faça um laço for que repita 3 vezes.

A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.

Instancie um novo Produto e guarde nele os valores digitados.

Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
         */

        Scanner sc = new Scanner(System.in);

        Produto novoProduto = new Produto();
        int i;

        for (i = 1; i <= 3; i++){
            System.out.println("\nDigite o nome do Produto: ");
             novoProduto.nome = sc.nextLine();
            System.out.println("Digite o preço: ");
            novoProduto.preco = sc.nextDouble();
            sc.nextLine();

            if (novoProduto.preco > 100.00){
                System.out.printf("\nProduto caro %s com valor %.2f ", novoProduto.nome, novoProduto.preco);

            } else {
                System.out.printf("Produto acessível  %s com valor %.2f ", novoProduto.nome, novoProduto.preco);


            }

        }
    }
}

/*
printf: imprime formatando o valor. Você escreve um "molde" com marcadores (%)
e o Java encaixa as variáveis ali. Ele não pula linha sozinho, por isso se coloca %n no final.

Os marcadores mais comuns:

    %s: texto (String)
    %d: número inteiro (int)
    %f: número decimal (double); %.2f mostra com 2 casas - usa-se vírgulas no print
    %n: quebra de linha
 */
