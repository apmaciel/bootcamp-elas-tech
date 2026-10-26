package org.example.aula24.AtividadePComportamento;

public class Main {
    static void main() {

        Voo v1 = new Voo();

        v1.adicionarObservador(new Passageiros());
        v1.mudarStatus("Embarque Iniciado");

        Voo v2 = new Voo();

        v2.adicionarObservador(new Passageiros());
        v2.adicionarObservador(new PainelAeroporto());
        v2.mudarStatus("Atrasado");


    }
}
