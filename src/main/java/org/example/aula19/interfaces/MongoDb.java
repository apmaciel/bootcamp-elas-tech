package org.example.aula19.interfaces;

public class MongoDb implements BancoDeDados {

    String pessoa;

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }


    @Override
    public int getNumero() {
        return 0;
    }

    @Override
    public void proibidoBarulhoDepoisDasDez() {

    }
}
