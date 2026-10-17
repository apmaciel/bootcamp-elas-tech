package org.example.atividadepolimorfismo.banco;

public class Boleto implements MeioPagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf("Você pagou no boleto R$ %.2f", valor);
        System.out.println("\n");
    }
}
