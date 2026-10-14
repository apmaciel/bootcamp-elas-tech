package org.example.atividadeencapsulamento;

public class Coisa {

    private String atributo;

    public String getAtributo(){//devolve ou busca
        return atributo;
    }
    public void setAtributo(String atributo){//recebe ou modifica

        if (atributo == null || atributo.isEmpty()) {
            System.out.println("Inválido! Mantido " + this.atributo);
            return;
        }
        this.atributo = atributo;
    }
}
