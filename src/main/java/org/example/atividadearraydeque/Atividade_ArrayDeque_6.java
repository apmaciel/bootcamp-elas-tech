package org.example.atividadearraydeque;

import java.util.ArrayDeque;

public class Atividade_ArrayDeque_6 {

    static void main() {

        /*
        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia  -> "Não tem ninguém na fila."
   - se tiver gente    -> "Próximo: [nome]"
   Depois adicione uma pessoa e teste de novo.
         */

        ArrayDeque<String> fila = new ArrayDeque<>();



        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila " );
        }else{
            System.out.println("Prximo: " + fila.peek());
        }

        fila.add("Ana Elize");

        if (fila.isEmpty()){
            System.out.println("Não tem ninguém na fila");
        }else {
            System.out.println("\nPróximo: " + fila.peek());
        }


    }
}
