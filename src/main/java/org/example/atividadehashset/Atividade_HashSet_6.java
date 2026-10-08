package org.example.atividadehashset;

import java.util.HashSet;

public class Atividade_HashSet_6 {
    static void main() {

        /*
        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
   imprima o isEmpty() de novo.
         */

        HashSet<String> vazio = new HashSet<>();

        System.out.println(vazio.isEmpty());

        vazio.add("Ana");

        System.out.println(vazio.isEmpty());
    }
}
