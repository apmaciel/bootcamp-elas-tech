package org.example.atividadearraylist;

import java.util.ArrayList;
import java.util.List;

public class Atividade_3_ArrayList {
    static void main() {

        /*
    - Crie uma lista com quatro nomes.
    Troque o nome da posição 2 por outro e imprima a lista antes e depois.
         */

        ArrayList<String> nome = new ArrayList<>(List.of("Beth", "Milena", "Iza", "Joca"));

        System.out.println(nome);

        nome.set(2, "Joana");

        System.out.println(nome);
    }
}
