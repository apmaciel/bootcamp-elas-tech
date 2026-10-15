package org.example.atividadeheranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou as férias de " + quem);

    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + mensagem);
    }

    @Override
    public void exporta() {
        System.out.println( nome + " Exporta produtos");
    }
}
