/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarecursividade;

import java.util.Scanner;

public class Somatorio {


    public static int somatorioDeUmNumero(int num) {

        if (num == 0) {
            return 0;
        }
        return num + somatorioDeUmNumero(num - 1);
    }


    public static void main(String[] args) {


        Scanner r = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num = r.nextInt();

        System.out.println("somatorio de " + num + " é: " + somatorioDeUmNumero(num));

        int n = 0;

        System.out.println();
        while (n <= 8) {
            System.out.println("somatório de " + n + " é: " + somatorioDeUmNumero(n));
            n++;
        }


        n = 10;
        System.out.println();
        do {
            System.out.println("somatório de " + n + " é: " + somatorioDeUmNumero(n));
            n++;
        } while (n <= 20);


        n = 45;
        System.out.println();
        for (int i = 30; i < n; i++) {
            System.out.println("somatorio de " + i + " é: " + somatorioDeUmNumero(i));

        }

    }


}
