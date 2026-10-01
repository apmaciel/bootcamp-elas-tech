package org.example.aula2;

public class Atividade_2_Operadores_Aritmeticos {
    static void main() {
          /*
    Aritméticos:
     0- Rode esse código:
    System.out.println("2 + 2 = " + 2 + 2);.
    Agora rode:
    System.out.println("2 + 2 = " + (2 + 2));
    Explique em um comentário por que deram resultados diferentes.
       */

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // O primeira faz concatenação pois identifica como String por conta do sinal de +.
        // Já o segundo realiza a operação corretamente por conta de está entre parênteses.

       /*
       1- Crie variáveis para dois números inteiros de valor
        a = 10 e b = 3 e mostre na tela:
        soma, subtração, multiplicação, divisão e resto.
        */

        int A = 10;
        int B = 3;
        int soma = A + B;
        int sub = A - B;
        int mult = A * B;
        int div = A / B;
        int resto = A % B;

        System.out.println("Soma = " + soma + ", Subtração = " + sub +
                ", Multiplicação = " + mult +
                ", Divisão = " + div + ", Resto da Divisão = " + resto);

    /*
    2- Crie variáveis para dois números decimais de valor
     a = 10 e b = 3
     e mostre na tela: soma, subtração, multiplicação, divisão e resto.

       */

        double a = 10;
        double b = 3;

        System.out.println("Soma = " + (a + b) + ", Subtração = " + (a - b) +
                ", Multiplicação = " + (a * b) + ", Divisão = " + (a / b) +
                ", Resto = " + (a % b));

/*
3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
 */
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        System.out.println("Soma = " + (nota1 + nota2 + nota3) + ", Média = " +
                (nota1 + nota2 + nota3) / 3);


        /*4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
         */

        System.out.println(" a + b * c = " + (3 + (4 * 5)));

        /*
        5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.
         */

        System.out.println("(a + b) * c = " + ((3 + 4) * 5));

      /*
      Desafio: Crie uma variável com 3785 segundos.
      Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

      Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.
       */

        int segundos = 3785;
        int minutos = 60;

        System.out.println("Minutos inteiros = " + ( segundos / minutos) +
                " e Segundos Restantes = " + (segundos % minutos) );
    }
}
