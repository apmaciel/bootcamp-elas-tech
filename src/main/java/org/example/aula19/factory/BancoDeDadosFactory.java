package org.example.aula19.factory;

import org.example.aula19.atividade.BancoDeDados;
import org.example.aula19.atividade.MySql;
import org.example.aula19.atividade.Oracle;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao) {
        if (opcao == 1) {
            return new MySql(1);
        } else if (opcao == 2) {
            return new Oracle(2);
        } else {
            throw new IllegalArgumentException("Opção inválida.");
        }
    }
}


