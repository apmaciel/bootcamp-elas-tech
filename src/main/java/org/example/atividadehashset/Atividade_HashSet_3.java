package org.example.atividadehashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Atividade_HashSet_3 {

    static void main() {
        /*
        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
   tirar os repetidos. Imprima os dois e compare.
         */

        ArrayList<String> names = new ArrayList<>(List.of("João", "Maria", "Maria", "Maria", "Junia"));
        System.out.println("Array List " + names);

        HashSet<String> semRepetidos = new HashSet<>(List.of("João", "Maria", "Maria", "Maria", "Junia"));
        System.out.println("HashSet " + semRepetidos);



    }
}
