package org.example.aula19.atividade;

public class Oracle implements  BancoDeDados{

    int numero;

    public Oracle(int numero) {
        this.numero = numero;
    }

    @Override
    public void chamarBanco() {
        System.out.println("Conectou ao banco de dados Oracle");
    }

    @Override
    public int getnumero() {
        return numero;
    }
}
