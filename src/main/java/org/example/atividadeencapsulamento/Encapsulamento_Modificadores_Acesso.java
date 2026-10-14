package org.example.atividadeencapsulamento;

public class Encapsulamento_Modificadores_Acesso {

    static void main() {

        Conta_Bancaria c = new Conta_Bancaria();

        c.setTitular("");
        System.out.println(c.getTitular());
        c.setTitular("Ana");
        System.out.println(c.getTitular());



        c.setSaldo(-5000);
        System.out.println(c.getSaldo());


    }
}
