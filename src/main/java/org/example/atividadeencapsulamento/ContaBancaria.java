package org.example.atividadeencapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private  String numeroConta = "001-X";

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {

        if (titular == null || titular.isEmpty()) {
            System.out.println("Títular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente " + this.saldo);
            return;
        }
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. ");
        } else {
            saldo = saldo + valor;
            registrarLog("deposito de " + valor);

        }
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
           saldo =  saldo - valor;
           registrarLog("Saque de " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    private boolean temSaldo(double valor) {
        if (saldo >= valor) {
            return true;
        } else {
            return false;
        }
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] " + titular + " saque de " + acao);

    }
}


