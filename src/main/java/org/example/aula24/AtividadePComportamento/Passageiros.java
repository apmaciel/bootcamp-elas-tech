package org.example.aula24.AtividadePComportamento;

public class Passageiros implements ObservadorVoo{

    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}
