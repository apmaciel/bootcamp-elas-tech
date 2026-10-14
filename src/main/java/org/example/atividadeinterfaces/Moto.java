package org.example.atividadeinterfaces;

public class Moto implements Veiculos{

    @Override
    public void acelerar() {
        System.out.println("Moto acelera 40km");
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }
}
