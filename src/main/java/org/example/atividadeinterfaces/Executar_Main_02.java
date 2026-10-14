package org.example.atividadeinterfaces;

import java.util.ArrayList;

public class Executar_Main_02 {
    static void main() {
        ArrayList<Notificacao> noti = new ArrayList<>();

        noti.add(new Sms());
        noti.add(new Email());

        for (Notificacao n : noti){
            n.enviar("Sua compra foi aprovada!");
        }
    }
}
