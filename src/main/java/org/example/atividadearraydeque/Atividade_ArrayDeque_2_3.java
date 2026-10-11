package org.example.atividadearraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade_ArrayDeque_2_3 {

    static void main() {

        /*
        2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
   imprima a fila logo depois. Repare que ela não mudou.
         */

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Ana","Joice","Maya","Patricia","Pedro", "José"));

        System.out.println(fila.peek());
        System.out.println(fila);

                /*
        3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
   depois. Compare com o exercício 2.
         */

        System.out.println(fila.poll());
        System.out.println(fila);
    }
}
