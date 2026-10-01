package org.example.aula5;

import java.util.Scanner;

public class While {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234) {
            System.out.println("Digite a sua senha: ");
            senha = sc.nextInt();
        }
    }
}
