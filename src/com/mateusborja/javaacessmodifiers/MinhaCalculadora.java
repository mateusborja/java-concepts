package com.mateusborja.javaacessmodifiers;

import java.util.Scanner;

public class MinhaCalculadora {

    static int somaResul1;

    public static int somar(int[] num1, int[] num2) {
        int vlrNum1 = 0;
        int vlrNum2 = 0;
        int somaIntervalo = 0;

        for (int i = 0; i < num1.length; i++) {
            if (num1.length % 2 == 0) {
                vlrNum1 += num1[i];

            } else {
                vlrNum1 = num1.length;
            }

        }

        for (int i = 0; i < num2.length; i++) {
            if (num2.length % 2 == 0) {
                vlrNum2 += num2[i];
            } else {
                vlrNum2 = num2.length;
            }

        }
        somaIntervalo = vlrNum1 + vlrNum2;

        return somaIntervalo;

    }

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("numero 1: ");
        int num1 = sc.nextInt();


        System.out.print("numero 2: ");
        int num2 = sc.nextInt();

        somaResul1 = MinhaCalculadora.somar(num1, num2);
        System.out.println("resultado da soma = " + somaResul1);

        System.out.println("soma vetores = " + MinhaCalculadora.somar(12,13));


    }


}
