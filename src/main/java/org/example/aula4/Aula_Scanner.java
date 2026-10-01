package org.example.aula4;

public class Aula_Scanner {
    static void main() {
       // Scanner scanner = new Scanner(System.in);

      //  Animal gato = new Animal(); //novo animal do tipo gato
        //contrutor existe para criar cópias da classe
        //Animal cachorro = new Animal();
        //int numero = 1;

        Veiculo fiatUno = new Veiculo();

        fiatUno.qtdPortas = 4;
        fiatUno.marca = "Fiat";

        System.out.println(fiatUno.marca);






    }
}

/*
Apreendemos a criar classes e etributos para reutilizacao de variavel

criamos uma classe --- e essas classes tem variaveis e atributos.
e podemos utilizar em cada objeto novo criado dessa classe.

Scanner --> serve para receber um input do usuário, quando ele digita

como usa --> cria um objeto e importa o seu package

Ele possuí uma classe --> Scanner

    ex: Scanner nome2 = scannerQVouUsar.nextLine():

    ex Scanner scanner = new Scanner(system.in)

 */
