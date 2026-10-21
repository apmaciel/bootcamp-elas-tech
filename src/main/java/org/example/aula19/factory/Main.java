package org.example.aula19.factory;

import org.example.aula19.atividade.BancoDeDados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual banco deseja conectar? (1 - MySql | 2 - Oracle)");
        int opcao = sc.nextInt();

        // A fábrica decide qual classe criar
        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);

        conectarBanco(banco);
    }

    // Recebe QUALQUER banco que implemente a interface BancoDeDados
    static void conectarBanco(BancoDeDados banco) {
        banco.chamarBanco();
        banco.getnumero();
    }
}
