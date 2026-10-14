package org.example.atividadeforeach;

public class Atividade_For_Each_04 {
    static void main() {

        // 1- ter uma lista de nomes
        // 2- criar um contador começando em zero
        // 3- para cada nome na lista:

                //4- se o nome tiver mais que 5 letras:
                    //- somar 1 no contador

                //5- depois de olhar todos, mostrar o total.

        String [] nomes = {"Jan", "Jasmine", "Jussara", "Marcos", "Douglas"};

        int contador = 0;

        for (String n : nomes ){
            if(n.length() > 5){
                contador = contador + 1;

            }
        }
        System.out.println("Total : " + contador);
    }
}
