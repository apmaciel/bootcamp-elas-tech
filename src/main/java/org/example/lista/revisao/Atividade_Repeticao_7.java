package org.example.lista.revisao;

import java.util.Scanner;

public class Atividade_Repeticao_7 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Deseja iniciar ?" +
                    "Presione 1 - Continuar, 2- Para Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Digite nota 1 : ");
                    aluna.nota = sc.nextDouble();
                    System.out.println("Digite nota 2 :");
                    aluna.nota2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite seu nome : ");
                    aluna.nome = sc.nextLine();


                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, " +
                            "sua segunda nota foi %.1f, e sua média final foi de %.1f. Aluna aprovada \n", aluna.nome, aluna.nota, aluna.nota2, aluna.media);

                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo");

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}