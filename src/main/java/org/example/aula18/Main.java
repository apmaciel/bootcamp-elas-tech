package org.example.aula18;

public class Main {
    static void main() {
                            //aqui construtor
        Boneca barbie = new Boneca(); //objeto da classe Barbie

        barbie.nome = "Barbie Profissões"; //acessando atributos
        barbie.corcaCabelo = "Loiro";
        barbie.tamanho = 12;

        Brinquedo brinquedo = new Brinquedo();

        brinquedo.nomeBrinquedo = "Carro";

        brinquedo.verBrinquedo(brinquedo);




    }

/*
Criem duas classes, uma chamada Main e outra chamada Brinquedos.
Crie um método dentro da classe Brinquedos chamado verBrinquedo,
e faça ele receber uma instância da classe Brinquedo e
printar qual instância foi.

Exemplo

"O brinquedo escolhido foi: "
 */

}
