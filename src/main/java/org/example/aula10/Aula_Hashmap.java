package org.example.aula10;

import java.util.HashMap;

public class Aula_Hashmap {

    static void main() {

        HashMap<String, String > emails = new HashMap<>();

        emails.put("Ana", "ana@gmail.com");
        emails.put("jessica@gmail.com", "Jessica");

        System.out.println(emails.get("Ana")); // busca a chave e exibe o valor guardado nela

        System.out.println(emails.get("jessica@gmail.com"));

        System.out.println(emails.getOrDefault("ola", "Posição Inválida"));

        System.out.println(emails.keySet()); // mostra as chaves

        System.out.println(emails.values()); // mostra os valores das chaves

        System.out.println(emails.containsKey("Ana")); // verifica se tem e retorna verda. ou false

        System.out.println(emails.containsValue("Ana")); //

        emails.remove("jessica@gmail.com");

        System.out.println(emails.keySet());
    }

}

/*
Hashmap --> recebe duas coisas

Não ordenardo - os elementos não fica, salvos em uma ordem específica

Permite nulos: aceita uma única chave null e múltiplos valores null.

Performance : as operações básicas de adicionar (put) e buscar(get)
são rápidas.

Hashmap - não busca pela posição só pela chave
Você procura a palavra e acha o signifiado
ou agenda - procura o nome e acha o telefone

para declarar --> chave = key
                  valor = value
                  tabela Hash = calcular a posição exata onde o dado está guardado,
                  o que deixa a busca mais rápida


        .put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of()

 */
