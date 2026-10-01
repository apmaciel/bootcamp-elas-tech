package org.example.aula7;

public class Aula_Arrays {

    static void main() {

        int [] notas = {3, 4, 7, 9, 10, 12, 88, 4, 8}; //declarando aqui o array
        int [] outrasNotas = new int[3]; // quando sabe o total

        //System.out.println(notas[1]);// para verificar a posicao
        //System.out.println(notas.length);// total do meu array

        for( int i = 0; i < notas.length; i++ ){
            System.out.println(notas[i]); // para exibir todos
        }//para exibir todos que estao no array
    }
}
