package org.example.aula20.atividademetodoscombuilder;

public class Main {
    static void main() {

// a) Thor
        Agendamentos thor = Agendamentos.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(10)
                .build();

        // b) Luna
        Agendamentos luna = Agendamentos.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        // c) Mel
        Agendamentos mel = Agendamentos.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }
}



