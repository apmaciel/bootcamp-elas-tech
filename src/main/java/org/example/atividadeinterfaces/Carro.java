package org.example.atividadeinterfaces;

public class Carro implements Veiculos{

    @Override
    public void acelerar() {
        System.out.println("Carro acelera 120km");
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }
}
