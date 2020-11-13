/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarecursividade;

public class Fibonnaci {


    public static int fibonnaciRecursivo(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonnaciRecursivo(num - 1) + fibonnaciRecursivo(num - 2);

    }


    public static void main(String[] args) {

        System.out.print("seq fibonacci = ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + fibonnaciRecursivo(i));
        }


    }

}
