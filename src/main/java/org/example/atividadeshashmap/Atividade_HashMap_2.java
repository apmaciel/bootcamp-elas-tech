package org.example.atividadeshashmap;

import java.util.HashMap;

public class Atividade_HashMap_2 {

    static void main() {

        /*
        2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
   Imprima outra vez e veja o que aconteceu com o tamanho.
         */

        HashMap<String, Double> produto = new HashMap<>();

        produto.put("Café", 5.00);
        System.out.println(produto.get("Café"));
        System.out.println(produto.size());

        produto.put("Café", 7.50);
        System.out.println(produto.get("Café"));

        System.out.println(produto.size());

    }
}
