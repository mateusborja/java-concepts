package com.mateusborja.whileexample01;

import java.util.Scanner;

public class WhileExample02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;

        idade = sc.nextInt();
        int soma = 0;
        int ct = 0;

        while(idade >=0) {

            soma = soma + idade;
            ct = ct + 1;
            idade = sc.nextInt();
        }

        if (ct > 0) {
            double  media = soma / ct;
            System.out.printf("A media das idades e: %.2f%n", media);
        } else {
            System.out.println("Impossivel calcular.");
        }

        sc.close();
    }
}
