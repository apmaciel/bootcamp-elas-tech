package org.example.atividadearraylist;

import java.util.ArrayList;
import java.util.List;

public class Atividade_4_ArrayList {
    static void main() {

        /*
        - Crie uma lista com quatro cidades.
        Remova a da posição 1 e imprima quantas sobraram.
         */

        ArrayList<String> lNome = new ArrayList<>(List.of("Bahia", "Manaus", "São Paulo", "Rio de Janeiro"));

        lNome.remove(0);

        System.out.println("Sobraram: " + lNome + " total: " + lNome.size());
    }
}
