package org.example.lista.revisao;

public class Atividade_Repeticao_4 {
    static void main() {

        /*
 4 - Crie uma classe chamada Pet.

Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.
         */

        Pet cachorro = new Pet();

        cachorro.nome = "Bieber";
        cachorro.raca = "Border Collie";
        cachorro.peso = 17.0;

        System.out.println("Nome do pet: " + cachorro.nome);
        System.out.println("A raça do: " + cachorro.raca);
        System.out.println("O peso do pet: " + cachorro.peso);

        Pet gato = new Pet();

        gato.nome = "Mimi";
        gato.raca = "Siamês";
        gato.peso = 4.5;

        System.out.println("\nNome do pet: " + gato.nome);
        System.out.println("Raça do pet: " + gato.raca);
        System.out.println("Peso do pet: " + gato.peso);
    }
}
