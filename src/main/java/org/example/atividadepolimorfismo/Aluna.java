package org.example.atividadepolimorfismo;

public class Aluna extends Pessoa{

    void souAluna(double nota){
        System.out.printf("Sou aluna %s tenho %d de idade e minha nota é %.1f" , nome, idade, nota);
    }
}
