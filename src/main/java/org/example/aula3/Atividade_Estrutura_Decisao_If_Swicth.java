package org.example.aula3;

public class Atividade_Estrutura_Decisao_If_Swicth {
    static void main() {
         /*
        1 — Crie uma variável idade e mostre a categoria de uma pessoa:
        menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

         */
        int idade = 60;

        if (idade <= 13) {
            System.out.println("Criança\n");

        } else if (idade > 13 && idade <= 17) {
            System.out.println("Adolescente \n");


        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto \n");


        } else {
            System.out.println("Idoso \n");

        }

        /*

        2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente"
         e quanto está faltando.
         */

        double saldo = 500.00;
        double valorCompra = 320.00;

        if (saldo >= valorCompra) {
            System.out.println(" \nCompra Aprovada!!! Saldo  R$ " + (saldo - valorCompra));
        } else {
            System.out.println("Saldo Insuficiente \n");

        }

        /*
        3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch,
        mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá.
        Qualquer outro número mostra "Opção inválida".
         */

        int opcao = 10;

        switch (opcao) {
            case 1:
                System.out.println("\nCafé\n");
                break;
            case 2:
                System.out.println("\nCappuccino\n");
                break;
            case 3:
                System.out.println("\nChocolate Quente\n");
            case 4:
                System.out.println("\nChá\n");
                break;
            default:
                System.out.println("\nOpção Inválida\n");


        }


        /*
        4 — Crie variáveis idade (17) e temAutorizacao (true).
        Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
        precisa ter 18 anos e ter autorização.
         */

        int idadeFesta = 18;
        boolean temAutorizacao = true;

// Regra 1: 18 anos OU autorização
        if (idadeFesta >= 18 || temAutorizacao) {
            System.out.println("\nOU: Pode entrar na festa");
        } else {
            System.out.println("\nOU: Não pode entrar na festa \n");
        }

// Regra 2: 18 anos E autorização
        if (idadeFesta >= 18 && temAutorizacao) {
            System.out.println("\nE: Pode entrar na festa \n");
        } else {
            System.out.println("\nE: Não pode entrar na festa \n");

        }

        /*
        Desafio: Crie variáveis para três notas de uma aluna.
        Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5.
        Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

         */
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media > 7) {
            System.out.printf("Aprovada sua média é: %.2f\n", media);
        } else if (media <= 5 && media <= 6.9) {
            System.out.printf("Recuperacao sua média é: %.2f\n", media);

        } else {
            System.out.printf("Reprovada sua média é: %.2f\n", media);

        }
    }
}

