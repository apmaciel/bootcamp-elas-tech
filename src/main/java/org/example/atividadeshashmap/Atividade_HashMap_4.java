package org.example.atividadeshashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade_HashMap_4 {

    static void main() {

        /*
        4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare.
         */

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.putAll(Map.of("Café" , 30 , "Maionse", 50));

        System.out.println(estoque.getOrDefault("Café", 0));

        System.out.println(estoque.getOrDefault("Açucar", 0));

        System.out.println(estoque.get("Açucar"));
    }
}
