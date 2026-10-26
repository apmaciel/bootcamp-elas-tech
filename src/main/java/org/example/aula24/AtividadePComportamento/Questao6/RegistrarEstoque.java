package org.example.aula24.AtividadePComportamento.Questao6;

public class RegistrarEstoque implements ObservarEstoque{
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade " + quantidade);
    }
}
