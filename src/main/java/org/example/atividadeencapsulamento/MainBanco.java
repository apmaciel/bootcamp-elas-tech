package org.example.atividadeencapsulamento;

public class MainBanco {
    static void main() {

        ContaBancaria c = new ContaBancaria();
        c.setTitular("Ana");

        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);

        System.out.println("Saldo: " + c.getSaldo());

        System.out.println(c.getNumeroConta());
    }
}
