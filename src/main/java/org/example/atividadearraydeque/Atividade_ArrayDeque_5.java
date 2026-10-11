package org.example.atividadearraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade_ArrayDeque_5 {

    static void main() {

        ArrayDeque<String> nomes = new ArrayDeque<>();

        nomes.addAll(List.of("Ana", "Bia", "Zoe"));

        System.out.println(nomes.contains("Bia"));

    }

    /*
    5. Crie uma fila com três nomes e use contains para responder duas
   perguntas: se "Bia" está na fila e se "Zoe" está.
     */




}

