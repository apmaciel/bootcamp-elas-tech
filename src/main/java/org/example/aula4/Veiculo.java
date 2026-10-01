package org.example.aula4;

public class Veiculo {

    int qtdPortas;
    String marca;
    String Modelo;
    int qtdRodas;

    @Override
    public String toString() {
        return "Veiculo{" +
                "Quantidade de Portas " + qtdPortas +
                ", Marca'" + marca + '\'' +
                ", Modelo '" + Modelo + '\'' +
                ", Quantidaade de Rodas " + qtdRodas +
                '}';
    }
}

