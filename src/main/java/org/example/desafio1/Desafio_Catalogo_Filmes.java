package org.example.desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio_Catalogo_Filmes {

    static void main() {
        // - contem classe filme.
        // - precisa de uma lista para armazenar os fimes criados

        Scanner sc = new Scanner(System.in);

        ArrayList<Filme> filmes = new ArrayList<>();
        //aqui criamos a lista com a classe de Filmes
        //pois iremos guardar as informações nela
        //iremos converter =

        int opcao;
        do {
            System.out.println("====== MEU CATÁLOGO =======");
            System.out.println("*  1 - Cadastrar Filmes   *");
            System.out.println("*  2 - Listar Filmes      *");
            System.out.println("*  3 - Buscar por Título  *");
            System.out.println("*  4 - Estatísticas       *");
            System.out.println("*  5 - Sair               *");
            System.out.println("===========================");

            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {


                //aqui coletamos as  informações
                case 1:
                    System.out.println("Adicione o título: ");
                    String titulo = sc.nextLine();

                    System.out.println("Adicione o gênero: ");
                    String genero = sc.nextLine();

                    System.out.println("Qual a nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    //agora iremos converter essas variáveis
                    //para guardar na Lista

                    Filme novoFilme = new Filme(); // ficha em branco
                    novoFilme.titulo = titulo; // convertendo para guarda na classe
                    novoFilme.genero = genero.toUpperCase();
                    novoFilme.nota = nota;

                    //estabelecendo o critério de classificação através da nota.

                    if (novoFilme.nota >= 8.0) {
                        novoFilme.classificacao = "Ótimo";
                    } else if (novoFilme.nota >= 5.0) {
                        novoFilme.classificacao = "Bom";
                    } else {
                        novoFilme.classificacao = "Ruim";
                    }

                    filmes.add(novoFilme); //aqui a lista pegou e adicionou os dados

                    System.out.println("Filme cadastrado " + titulo);

                    break;

                case 2:
                    if (filmes.isEmpty()) {
                        System.out.println("Não há filmes cadastrados.");
                    } else {
                        for (int i = 0; i < filmes.size(); i++) {
                            Filme f = filmes.get(i);
                            System.out.println(f.titulo + " [" + f.genero + "] - Nota "
                                    + f.nota + " - " + f.classificacao);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Busque o filme: ");
                    String busca = sc.nextLine();

                    boolean achou = false;

                    for (Filme f : filmes) {
                        if (f.titulo.equalsIgnoreCase(busca)) {
                            System.out.println(f.titulo + " [" + f.genero + "] - Nota "   // ✏️ mostra o filme
                                    + f.nota + " - " + f.classificacao);
                            achou = true;
                        }
                    }

                    if (!achou) {
                        System.out.println("Filme não encontrado.");
                    }
                    break;

                case 4:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                        break;
                    }

                    double soma = 0;
                    Filme melhor = filmes.get(0);
                    int otimos = 0;

                    for (Filme f : filmes) {
                        soma += f.nota;

                        if (f.nota > melhor.nota) {
                            melhor = f;
                        }

                        if (f.classificacao.equals("Ótimo")) {
                            otimos++;
                        }
                    }

                    double media = soma / filmes.size();

                    System.out.println("Filmes cadastrados: " + filmes.size());
                    System.out.printf("Média das notas: %.2f%n", media);
                    System.out.println("Maior nota: " + melhor.titulo);
                    System.out.println("Filmes Ótimos: " + otimos);
                    break;

                case 5:
                    System.out.println("Saindo... até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida!");

            } // fecha o SWITCH

        } while (opcao != 5); // fecha o DO

        sc.close();

    } // fecha o MAIN

} // fecha a CLASSE}