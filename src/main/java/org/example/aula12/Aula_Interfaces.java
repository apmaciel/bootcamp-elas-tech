package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class Aula_Interfaces {

    static void main(String[] args) {
        Coelho pernalonga = new Coelho();
        pernalonga.fugir();

        Pombo dove =  new Pombo();
        dove.fugir();


        Presa coelhinho = new Coelho();
        Presa pommbinho = new Pombo();

        ArrayList<String> lista = new ArrayList<>();
        List<ArrayList> lista2 = new ArrayList<>();

    }


}
/*
Interface --> é um contrato em java, que funciona como um contratro ou uma
lista de regras. Ela diz o que uma classe deve fazer,
mas não como ela faz isso.

Função --> todo mundo que acessar essa interface, é obrigado a assinar um
contrato.

se criar indo no arquivo e clica class e depois em interface

A interface diz o que uma classe deve fazer

Os métodos a serem implementados nas classes são obrigatoriamente públicos

implements -> a forma que a classe assina o contrato

Override --> é uma anotação é um recado, portite que vai dizer

olha java essa coisa abaixo de mim é um método de uma interface
Override = substituir

Com o Override o Java exige que a implementação

 */
