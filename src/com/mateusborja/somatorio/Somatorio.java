/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

//5 = 5 + 4 + 3 + 2 + 1 + 0 ou 5 + somatorio(4)
package com.mateusborja.somatorio;

public class Somatorio {

    private static int somatorio(int num) {
        if (num == 1) {
            return 1;
        }

        return somatorio(num - 1) + num;

    }

    public static void main(String[] args) {

        int x = 1;

        while (x < 10) {
            System.out.println("somatorio de " + x + " e: " + somatorio(x));
            x++;

        }


    }
}
