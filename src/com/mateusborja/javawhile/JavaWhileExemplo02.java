package com.mateusborja.javawhile;

import java.util.Scanner;

public class JavaWhileExemplo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x !=0) {
            soma = soma + x; // soma += x;
            x = sc.nextInt();
        }
        System.out.printf("A soma dos numeros é: %d%n",soma);

        sc.close();

    }
}
