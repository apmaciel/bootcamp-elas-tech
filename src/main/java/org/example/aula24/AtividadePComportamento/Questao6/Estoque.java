package org.example.aula24.AtividadePComportamento.Questao6;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int quantidade;

    private List<ObservarEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservarEstoque o){
        observadores.add(o);
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
        for (ObservarEstoque o : observadores){
            o.atualizar(quantidade);
        }
    }
}
