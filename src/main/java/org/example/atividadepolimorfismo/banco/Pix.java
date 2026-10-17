package org.example.atividadepolimorfismo.banco;

public class Pix implements MeioPagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf("Você pagou no pix R$ %.2f", valor);
        System.out.println("\n");
    }
}
