package org.example.aula24.AtividadePComportamento.Questao6;

public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarObservador(new RegistrarEstoque());

        estoque.setQuantidade(50);
        estoque.setQuantidade(30);
    }
}
