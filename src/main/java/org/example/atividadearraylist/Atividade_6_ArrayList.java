package org.example.atividadearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_6_ArrayList {
    static void main() {

        /*
     - Crie uma lista com cinco nomes.
     Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
         */

        ArrayList<String> cincoNomes = new ArrayList<>(List.of("Messi", "Julia", "Marcos", "João", "Betania"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome para a busca: ");
        String nomeBuscado = sc.nextLine();

        int posicao = cincoNomes.indexOf(nomeBuscado);

        if( posicao != -1){
            System.out.println("O nome está na lista: " + nomeBuscado.contains(nomeBuscado) + " A posição é " + posicao);
        }else {
            System.out.println("O nome não está na lista!");
        }
    }
}
