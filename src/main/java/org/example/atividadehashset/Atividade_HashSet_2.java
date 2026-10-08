package org.example.atividadehashset;

import java.util.HashSet;
import java.util.List;

public class Atividade_HashSet_2 {
    static void main() {

     /*   2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        de um if para avisar se a cor "verde" já está no conjunto ou não.
        */

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Amarelo", "Verde", "Azul", "Rosa"));

        if(cores.contains("Verde")){
            System.out.println("A cor já está no conjunto");
        }else {
            System.out.println("Não está no conjunto");
        }




    }
}
