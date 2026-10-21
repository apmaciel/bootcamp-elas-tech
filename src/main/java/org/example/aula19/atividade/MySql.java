package org.example.aula19.atividade;

public class MySql implements BancoDeDados{

    int numero;

    @Override
    public void chamarBanco() {
        System.out.println("Conectou ao banco MySLQ");
    }

    public MySql(int numero) {
        this.numero = numero;
    }

    @Override
    public int getnumero() {
        return numero;

    }
}
