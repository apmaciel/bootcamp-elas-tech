package org.example.atividadearraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade_ArrayDeque_4 {
    static void main() {

     /*   4. Crie uma fila com três nomes e atenda todos usando
        while (!fila.isEmpty()). No final, imprima "Fila vazia!".*/

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Ana", "Joana", "Marcela"));

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        System.out.println("\nFila vazia");


    }
}
