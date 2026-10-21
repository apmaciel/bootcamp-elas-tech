package org.example.aula19.interfaces;

public class Main {
    static void main() {

//        MySQL mySQL = new MySQL();
//        MongoDb mongpDb = new MongoDb();
//        BancoDeDados oracle = new MongoDb(); //
//
//        BancoDeDados mongo = new MongoDb(); //aqui ñ conseguimos acessar a variável pessoa
//        //pois é criado a partir da interface
//
//        metodo(mySQL);

        MySQL mySQL = new MySQL(); //acessa sua classe  e mais a da interface
        mySQL.getNome();

        BancoDeDados novoSql = new MySQL(); // criando a partir da Interfce Banco de Dados
        //mas possuí limitações não acessa os atributos da classe

        novoSql.getNumero();
    }

    public static void metodo(BancoDeDados bd) {

    }
}
