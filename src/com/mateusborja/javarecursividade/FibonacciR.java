/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarecursividade;

public class FibonacciR {

    public static int calculaFibonacci(int num) {

        if (num < 2) {
            return 1;
        }

        return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
    }

     static int somaSeq;

    public static void main(String[] args) {

        int calc1 = FibonacciR.calculaFibonacci(5);
        System.out.println(calc1);

        int[] ct = new int[0];
        System.out.print("sequencia: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + calculaFibonacci(i));

        }


        System.out.println();
        System.out.print("soma da seq = ");
        for (int i = 0; i < 20; i++) {
            somaSeq += calculaFibonacci(i);
        }
        System.out.println(somaSeq);

    }

}

