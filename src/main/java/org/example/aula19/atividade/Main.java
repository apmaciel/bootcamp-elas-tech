package org.example.aula19.atividade;

public class Main {

    static void main() {
        BancoDeDados mysql = new MySql(1);
        BancoDeDados oracle = new Oracle(2);

        conectarBanco(mysql);
        conectarBanco(oracle);
    }

    // Recebe QUALQUER banco que implemente a interface BancoDeDados
    static void conectarBanco(BancoDeDados banco) {
      banco.chamarBanco();
      banco.getnumero();
    }
}

/*
Crie uma interface BancoDeDados que implementa chamarBanco()
e getNumero(). Depois classes chamadas Oracle e MySql e Main.
MySql e Oracle devem implementar a interface.
chamarBanco() deve retornar uma mensagem de acordo com o banco conectado.

Exemplo:

O Banco conectado é o MySql.

Na sua Main crie um método conectarBanco()
para receber um dos bancos e dentro dele chamar o método chamarBanco() .
 */