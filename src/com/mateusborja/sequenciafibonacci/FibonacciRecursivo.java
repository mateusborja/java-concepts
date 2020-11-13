/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.sequenciafibonacci;

import java.util.Scanner;

public class FibonacciRecursivo {

    public static int fibonacciSeq(int num) {

        if (num < 2) {
            return 1;
        }
        return fibonacciSeq(num - 1) + fibonacciSeq(num - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("tell me num: ");
        int fb1 = sc.nextInt();


        System.out.println("seq: ");
        for (int i = 0; i < fb1; i++) {
            System.out.print(" " + fibonacciSeq(i));

        }


        sc.close();
    }

}
