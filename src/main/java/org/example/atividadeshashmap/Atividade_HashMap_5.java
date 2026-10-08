package org.example.atividadeshashmap;

import java.util.HashMap;

public class Atividade_HashMap_5 {

    static void main(String[] args) {

        /*
        5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
   Remova uma delas e imprima de novo.
         */

        HashMap<String, Double> alunas = new HashMap<>();

        alunas.put("Ane", 9.8);
        alunas.put("Izabella", 6.9);
        alunas.put("Natasha", 7.5);

        System.out.println(alunas);
        System.out.println(alunas.size());

        alunas.remove("Ane");

        System.out.println(alunas);
        System.out.println(alunas.size());

    }
}
