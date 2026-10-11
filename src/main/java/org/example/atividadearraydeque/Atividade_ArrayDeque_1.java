package org.example.atividadearraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade_ArrayDeque_1 {

    static void main() {

        /*
        1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
   e quantas pessoas tem.
         */

        ArrayDeque<String> pessoas = new ArrayDeque<>();

        pessoas.addAll(List.of("Ana", "Joselha", "Pedro"));

        System.out.println(pessoas);

        System.out.println(pessoas.size());


    }
}
