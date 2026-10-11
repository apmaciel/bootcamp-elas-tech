//package org.example.listarevisaocomreferencia;
//
//import java.util.Scanner;
//
//public class Revisao_Loop {
//    static void main() {
//
//        for(int i = 1; i <= 20; i++ ){
//            System.out.println(i);
//        }
//
//        for(int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite um número para ver sua tabuada entre 1 - 10");
//        int num = sc.nextInt();
//
//        for(int i = 1; i <= 10; i ++){
//            int resutado = num * i;
//
//            System.out.println(num + " x " + i + " = " + resutado);
//        }
//
//
//        for (int i = 1; i <= 30; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//
//        }
//
//        int soma = 0;
//        for(int i = 1; i <=100; i++){
//            soma = soma + i;
//            System.out.println(i + " + " + i + " = " + (soma));
//        }
//
//
//        int i = 1;
//        int soma = 0;
//        while (i <=100){
//            soma = soma + i;
//            System.out.println(soma);
//
//            i++;
//
//        }
//
//
//        int i = 1;
//
//        while (i <=20){
//            System.out.println(i);
//
//            i++;
//        }
//
//        int energia = 3;
//
//        do {
//            System.out.println("Jogando... energia: " + energia);
//            energia--;
//        } while (energia > 0);
//
//        System.out.println("Sem energia! Fim de jogo.");
//
//
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite a altura: ");
//        int altura = sc.nextInt();
//
//        for (int linha = 1; linha <= altura; linha++) {
//
//            for (int estrela = 1; estrela <= linha; estrela++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}
