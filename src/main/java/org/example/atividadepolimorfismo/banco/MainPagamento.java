package org.example.atividadepolimorfismo.banco;

public class MainPagamento {
    static void main() {

        MeioPagamento pgB = new Boleto();
        MeioPagamento pgP = new Pix();

        pgB.pagar(150.00);
        pgP.pagar(150.00);
    }
}
