package org.example.atividadehashset;

import java.util.HashSet;
import java.util.List;

public class Ativdade_HashSet_1 {

    static void main() {
/*

    1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.

 */
        HashSet<String> nomes = new HashSet<>();

        nomes.addAll(List.of("Ana Elize", "Bernardo Maciel", "João Bentes", "Bernardo Maciel"));

        System.out.println(nomes);
        System.out.println(nomes.size());



    }


}
