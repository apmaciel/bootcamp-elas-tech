package org.example.atividadehashset;

import java.util.HashSet;
import java.util.List;

public class Atividade_HashSet_5 {
    static void main() {

        /*
        5. Crie um HashSet com três frutas e percorra ele com for,
   imprimindo uma por linha.
         */

        HashSet<String> frutas = new HashSet<>();

        frutas.addAll(List.of("Banana", "Melão", "Melancia", "Morango", "Mexerica", "Uva", "Maça"));

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
