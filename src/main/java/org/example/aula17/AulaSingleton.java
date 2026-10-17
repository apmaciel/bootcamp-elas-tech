package org.example.aula17;

public class AulaSingleton {
    static void main() {

      ConexaoBanco testes = ConexaoBanco.getInstancia();
      //assim que estancia ou cria novos objetos com singleton
      // retorna a mesma que foi criada


    }
}

/*
O que são -->

Singleton --> garante instância única no sistema :
só pode existir um desse objeto

Factory --> centraliza a escolha da classe

Builder --> monta objetos complexos em etapas

Crie um atributo private static do tipo da própria classe. É onde o objeto único fica guardado. Começa como null.
Deixe o construtor private. Assim ninguém consegue usar new fora da classe.
Crie um método public static de acesso, geralmente chamado getInstancia().
Dentro dele, crie o objeto só se ainda não existir (if (instancia == null)).
Retorne sempre o mesmo objeto.
Acesse sempre pelo nome da classe: Classe.getInstancia(), nunca com new.


 */
