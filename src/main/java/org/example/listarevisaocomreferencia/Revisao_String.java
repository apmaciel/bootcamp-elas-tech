//package org.example.listarevisaocomreferencia;
//
//import java.util.Scanner;
//
//public class Revisao_String {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite seu nome completo.");
//        String nameCompleto = sc.nextLine();
//
//        System.out.println(nameCompleto.length());
//        System.out.println(nameCompleto.toUpperCase());
//        System.out.println(nameCompleto.toLowerCase());
//        System.out.println(nameCompleto.charAt(0));
//
//        System.out.println("Escreva uma frase: ");
//        String frase = sc.nextLine();
//        System.out.println("Escreva uma palavra: ");
//        String palavra = sc.nextLine();
//
//        if (frase.contains(palavra)){
//            System.out.println("A palavra " + palavra + " está contida na frase");
//        }else {
//            System.out.println("Não contém.");
//        }
//
//        System.out.println("Escreva seu nome");
//        String nome1 = sc.nextLine();
//        System.out.println("Escreva seu nome novamente");
//        String nome2 = sc.nextLine();
//
//        if (nome1.equalsIgnoreCase(nome2)){
//            System.out.println("Nomes iguais");
//        }else {
//            System.out.println("Nomes diferentes");
//        }
//
//        System.out.println("Escreva seu nome junto");
//        String nome = sc.nextLine();
//
//        String resultado = nome.trim().toLowerCase();
//
//        System.out.println(resultado);
//
//        System.out.println("Digite sua palavra: ");
//        String palavra = sc.nextLine();
//
//        palavra = palavra.toLowerCase();
//
//        char primeia = palavra.charAt(0);
//        char ultima = palavra.charAt(palavra.length() -1);
//
//        if (primeia == ultima){
//            System.out.println("Sim, começa e termina com a mesma letra" );
//
//        }else {
//            System.out.println("Começar com a letra : " + primeia + " e termina com a letra: " + ultima + ", não são iguais." );
//        }
//
//
//
//    }
//}
