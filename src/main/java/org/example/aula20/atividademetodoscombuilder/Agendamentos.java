package org.example.aula20.atividademetodoscombuilder;

import lombok.Builder;

@Builder
public class Agendamentos {

    private final String nomePet;
    private final String servico;
    private final String horario;
    private final boolean perfume;
    private final boolean laco;
    private final boolean hidratacao;
    private final String observacao;
    private final double desconto;

    public void mostrar() {
        System.out.println("=== Agendamento ===");
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + (perfume ? "sim" : "não"));
        System.out.println("Laço: " + (laco ? "sim" : "não"));
        System.out.println("Hidratação: " + (hidratacao ? "sim" : "não"));
        System.out.println("Observação: " + (observacao == null ? "-" : observacao));
        System.out.println("Desconto: " + desconto + "%");
        System.out.println();
    }


}
