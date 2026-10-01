package org.example.lista.revisao;

import java.util.Scanner;

public class Atividade_Repeticao_6 {

    static void main() {

//        6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
//
//        Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
//
//        Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
//
//                Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."


        int nascimento;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();
        System.out.println("Digite o ano do seu nascimento: ");
        nascimento = sc.nextInt();
        sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + nascimento );



    }
}
