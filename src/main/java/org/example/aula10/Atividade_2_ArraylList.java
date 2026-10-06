package org.example.aula10;

import java.util.ArrayList;
import java.util.List;

public class Atividade_2_ArraylList {
    static void main() {

        /*
        - Crie uma lista já preenchida com quatro frutas.
        Imprima a primeira, a última e quantas frutas tem.
         */

        ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "Maça", "Uva", "Morango"));

        System.out.println("Primeira Frunta: " + frutas.get(0));

        System.out.println("Última Fruta: " + frutas.get(3));

        System.out.println("Total: " + frutas.size());






    }
}
