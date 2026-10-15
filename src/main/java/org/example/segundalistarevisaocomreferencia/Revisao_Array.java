package org.example.segundalistarevisaocomreferencia;

import java.util.Scanner;

public class Revisao_Array {
    static void main() {

//        String [] nomes = {"Ana", "Douglas", "Bernardo", "Vito","Ozzy"};
//
//        System.out.println(nomes[0]);
//        System.out.println(nomes[2]);
//        System.out.println(nomes[4]);
//
//        int [] notas = {8, 6, 10, 7, 9};
//
//        int soma = 0;
//        int media = 0;
//
//        for (int i = 0; i < notas.length; i++){
//            soma = soma + notas[i];
//            media = soma / 5;
//        }
//        System.out.println("A soma das notas e : " + soma + " media e : " + media);
//
//
//        int [] num = {10, 20, 30, 40, 50};
//        int maior = num[0];
//
//        for (int i = 0; i < num.length; i++){
//            if(num[i] > maior){
//               maior = num[i];
//            }
//        }
//        System.out.println("O número maior é : " + maior);
//
//       int [] notas = {8, 5, 10, 4, 7};
//
//       for( int i = 0; i < notas.length; i++){
//           if(notas[i] >= 7){
//               System.out.println(notas[i]);
//           }
//       }

        Scanner sc = new Scanner(System.in);

        String [] nomes = {"Iza", "Bianca", "Milena", "Mary","Elly"};

        System.out.println("Digite um nome para verificar se esta na lista: ");
        String pesNome = sc.nextLine();

        int a = -1;

        for (int i = 0; i < nomes.length; i++){
            if (pesNome.equals(nomes[i])){
                a = i;

            }
        }

        if (a == -1){
            System.out.println("O nome não está na lista");
        }else {
            System.out.println(pesNome + " está na lista");

        }

    }
}
