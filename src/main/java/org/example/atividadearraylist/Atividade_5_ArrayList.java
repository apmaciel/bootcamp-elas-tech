package org.example.atividadearraylist;

import java.util.ArrayList;
import java.util.List;

public class Atividade_5_ArrayList {

    static void main() {

        /*
 - Crie uma lista com seis nomes
  e imprima todos usando um laço, no formato `"0: Ana"`.
  (Dica: i + ": " + comando para pegar posição da lista)
         */

        ArrayList<String> seisNomes = new ArrayList<>(List.of("Joe", "Bruce", "Breno", "Bruna", "Bia", "Joelma"));

        for( int i = 0; i < seisNomes.size(); i++){
            System.out.println(i + ": " + seisNomes.get(i));

        }
    }
}
