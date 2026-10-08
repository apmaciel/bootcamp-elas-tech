package org.example.atividadeshashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade_HashMap_1 {

    static void main() {
        /*
        1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
   inteiro e depois use get para mostrar a idade de uma delas.
         */

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.putAll(Map.of("Ana Vitoria", 23, "Juliana Cecília", 33, "Jessica Bentes", 67));

        System.out.println(pessoas);

        System.out.println("A idade de Jessica Bentes é " + pessoas.get("Jessica Bentes"));


    }
}
