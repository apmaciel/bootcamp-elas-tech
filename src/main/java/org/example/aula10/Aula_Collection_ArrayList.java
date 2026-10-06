package org.example.aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula_Collection_ArrayList {

    static void main() {

        ArrayList<String> listaNome = new ArrayList<>();
        ArrayList<Integer> nLista = new ArrayList<>();



        Scanner sc = new Scanner(System.in);


        //nLista.add(1);
        //nLista.add(2);



        nLista.addAll((List.of(1,2,3,3,9,10,11,12))); //para adicionar tudo

        System.out.println(nLista);

        nLista.remove(0); //remove da posição
        System.out.println(nLista);

        System.out.println(nLista.get(0)); //busca posição-acessa-pegar

        nLista.set(2, 98); // altera, modifica a posição -  troque a posição 2 por 98
        System.out.println(nLista);

        System.out.println(nLista.size()); //ver a quantidade

        System.out.println(nLista.contains(97)); //verifica se verdadeiro - ou falso o valor dito

        System.out.println(nLista.indexOf(98)); //verifica posição

        System.out.println(nLista.isEmpty()); // se ta vazio ou não




    }
}



/*
O que é collection --> clases e interfaces, no pacote java.util,
serve para criar pacotes, que serve para organizar e manipular
grupos de dados como uma única unidade.

Em vez de usar arrays tradicionais, que possuem tamanho fixo e exigem
controle manual de posições, as coleções oferecem estruturas de dados
dinânmicas e prontas para uso.

List = estruturas de dados, estruturas fixas, sem contado.
Map = me dá o valor guardado sob essa chave.
set = esse valor já está aqui --> sem nenhuma ordem, para checar se o valor ta lá
Queue = quem é o próximo --> fila, quem é o próximo da fila

List--> é um tipo de interface, é uma sequênci em que cada item tem uma posição.
começando em 0.

prática, use sempre ArrayList.

itens de um pedido, carrinho de compras, histórico de transações,
de uma conta (ordem), lista de funcionários para um relatório, linhas

Array         x         List
tamanho fixo    tamanho cresce
new int [5]     new ArrayList <>()   p/ tamanho
a [0]           new ArrayList <> ()  p/ criar
a[0] = 8        lista.add (8)        p/ adicionar
a[0]            lista.get(0)         p/ acessar
a.length        list.size()          p/ quantidade
endereço        o conteúdo           p/ imprimir direto


Para usar -> java.util.ArrayList;

recebe apenas (Integer, String, Double, Boolean)

Ex: ArrayLista<String> nomes = new ArrayList<>();

nomes.add("Ana")
nomes.add("Bia")
nomes.add("Carla")

System.out.printl(nomes);

Principais Comandos:
        .add(); --> adiciona na lista
        .get(); --> acessa os valores da lista vai buscar
        .size(); --> mostra o tamanho da lista
        .contains(); --> mostra o que contém dentro e retorna verda - falso
        .indexOf(); --> diz a posição que o num está
        .remove(); --> remove da lista ou da posição
        .set(); --> vai colocar algo na posição ou modificar
        .isEmpty(); --> verifica se tá vazio
        .addAll(List.of()); --> cria lista para por todos os valores


 */
