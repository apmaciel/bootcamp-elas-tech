package org.example.atividadepolimorfismo;

public class Professora extends Pessoa{

    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s ", nome, nota, aluna );
    }

    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}
