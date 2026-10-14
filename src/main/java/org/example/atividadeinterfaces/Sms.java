package org.example.atividadeinterfaces;

public class Sms implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
