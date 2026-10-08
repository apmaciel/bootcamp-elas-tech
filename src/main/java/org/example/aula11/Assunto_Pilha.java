package org.example.aula11;

import java.util.ArrayDeque;
import java.util.List;

public class Assunto_Pilha {
    static void main() {

        ArrayDeque<String> fila = new ArrayDeque<>();

//        if (fila.isEmpty() != true) {
//
//        } else {
            fila.add("Flora");
            fila.add("Ana");
            fila.add("Messi");
            fila.addAll(List.of("Maria", "Natalia", "Kerou"));

            System.out.println(fila);
            System.out.println(fila.peek());
            System.out.println(fila.poll());
            System.out.println(fila);

//        }
//
  }

}

/*

vai por ordem e não pode modificando no meio

como declarar ArrayDeque<String> fila = new ArrayDeque<>();

fila.addAll(List.of());

     .add("Ana");
     .peek(); espiar o 1° da fila
     .poll(); mandar embora 1° o elemento
     .isEmpty(); para ver se a fila tá vazia - if isEmpty
     .size();   tamanho
     .contains("Bia"); verifica uma coisa específica existente
     .addAll(List.of("Ana","Bia")); adiciona multiplos valores
 */

