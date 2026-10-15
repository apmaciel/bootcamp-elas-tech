package org.example.atividadeheranca;

public class Main_Empresa_Escolar {

    static void main() {
        Diretora novaDiretora = new Diretora();

        novaDiretora.nome = "Carla";

        novaDiretora.baterPonto();
        novaDiretora.aprovarFerias("Junia");
        novaDiretora.definirMetas("Alunos");

        Gerente novoGerente = new Gerente();

        novoGerente.nome = "Duda";

        novoGerente.notificar(" Hoje é um novo dia.");
        novoGerente.exporta();
        novoGerente.aprovarFerias("Joice");
        novoGerente.baterPonto();
    }
}
