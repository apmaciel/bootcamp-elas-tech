package org.example.lista.revisao;

import java.util.Scanner;

public class Atividade_Repeticao_1 {
    static void main() {
         /*

1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
     */

        Scanner sc = new Scanner(System.in);

    String nomeLanche ="";
    double valorLanche =0;
    double desconto = 5.00;

        System.out.println("Digite o nome do seu pedido: ");
        nomeLanche = sc.nextLine();
        System.out.println("Digite o preço do lanche: ");
        valorLanche = sc.nextDouble();

        if(valorLanche > 30.0){
            valorLanche = valorLanche - desconto;
            System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f%n", valorLanche);
        }

    }




}
