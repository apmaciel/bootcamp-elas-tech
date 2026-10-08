package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class Assunto_Interfaces_ForEach {

    static void main() {


        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "leão"));
//         for (int i = 0; i < animais.size(); i++){
//
//             System.out.println(animais.get(i));


        for (String animal : animais) {
            System.out.println(animais);

        }
    }
}
/*
for é melhor

for each --> é uma forma de iterar elementos de uma array ou
collection de forma mais simples --

serve --> para ver valores ou fazer algo com o mesmo

se lê "dentro de"

Não precisa escrever início, condição nem passo.

o tipo antes do nome é o tipo do que está dentro

Para percorrer Array

Estrutura:

for (String    nome   :   nomes)
   tipo  -  apelido - in - seu array

  lê-se: Para cada nome dentro de nomes...

limitacoes:

voce não vai saber em que posição está.

sem acesso ao contador.

Se precisar imprimir "Nota" --> usa o for comum

Excelente : ler e usar dados, usar dados guardado sem alterar

Interfaces:


 */
