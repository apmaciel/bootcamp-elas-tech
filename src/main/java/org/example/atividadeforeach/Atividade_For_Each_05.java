package org.example.atividadeforeach;

public class Atividade_For_Each_05 {

    static void main() {

        String [] names = { "Ana", "Joana", "Natana", "Keke"};

        for(String nome : names){
            System.out.println(nome);
        }

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}
