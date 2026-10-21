package org.example.aula19.interfaces;

public class MySQL implements BancoDeDados {
   private int numero;

   private String nome;

    @Override
    public void proibidoBarulhoDepoisDasDez() {

    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }


}
