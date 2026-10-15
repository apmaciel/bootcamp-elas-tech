package org.example.atividadeheranca;

public class Professora extends Pessoa{

    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s ", nome, nota, aluna);
    }
    @Override
    void apresentar(){
        System.out.println("Ola sou " + nome + " e ensino " + disciplina);
    }

}
