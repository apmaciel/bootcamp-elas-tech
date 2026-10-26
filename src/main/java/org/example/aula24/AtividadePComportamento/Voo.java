package org.example.aula24.AtividadePComportamento;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o){
        observadores.add(o);
    }

    public void mudarStatus(String status){
        for (ObservadorVoo o : observadores){
            o.atualizar(status);
        }
    }
}
