package org.example.listarevisaocomreferencia;

public class Revisao_Operadores {

    static void main() {

        double a = 15;
        double b = 4;

        System.out.printf("Soma: %.1f " , (a+b));
        System.out.printf("\nSubtração : %.1f", (a-b));
        System.out.printf("\nMultiplicação : %.1f", (a*b));
        System.out.printf("\nDivisão : %.1f", (a/b));
        System.out.printf("\nResto da Divisão : %.1f", (a%b));

        int saldo = 1000;
        int soma = saldo += 250;
        int resultado = saldo -=380;

        System.out.println(resultado);

        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira){
            System.out.println("Pode entrar na festa.");
        }else {
            System.out.println("Não permitido");
        }


        double num = 53;
        System.out.println(num%2);

        String compra = "Valor compra";
        double preco = 5.50;

        System.out.printf(" o %s é %.2f ", compra,(preco * 3));


//        double  a = 15;
//
//        System.out.println("Esse número é divisível por 3 e por 5 " + (a%3 == 0 && a%5 == 0));



    }
}
