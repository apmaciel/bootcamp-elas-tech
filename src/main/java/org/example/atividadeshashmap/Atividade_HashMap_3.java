package org.example.atividadeshashmap;

import java.util.HashMap;

public class Atividade_HashMap_3 {

    static void main() {

        /*
        3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
   dentro de um if para mostrar o telefone de alguém que está na agenda
   e de alguém que não está.
         */

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Beth Oliveira", "(11)9999-9999");
        agenda.put("Ana Eliza", "(11)98888-8888");

        if(agenda.containsKey("Marcos")){
            System.out.println("O número de telefone é " + agenda.get("Marcos"));
        }else {
            System.out.println("Número não está na agenda");
        }
    }
}
