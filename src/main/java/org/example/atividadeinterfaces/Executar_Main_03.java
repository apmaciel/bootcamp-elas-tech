package org.example.atividadeinterfaces;

import java.util.ArrayList;

public class Executar_Main_03 {

    static void main() {

        ArrayList<Veiculos>  veiculo = new ArrayList<>();

        veiculo.add( new Moto());
        veiculo.add(new Carro());

        for (Veiculos v : veiculo){
            v.ligar();
            v.acelerar();

        }
    }
}
