package org.example.atividadeforeach;

public class Atividade_For_Each_03 {

    static void main() {

        int [] notas = {8, 6, 10, 7};
        int soma = 0;

        for (int num :notas){
            soma += num;
        }
        System.out.println(soma);
    }
}
