/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays;

import java.util.Random;

public class ArrayExemplo04 {

    public static String nAleatorio() {
        String[] s = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Random r = new Random();
        String random = " ";
        for (int i = 0; i < 6; i++) {
            random = random + s[r.nextInt(s.length)];
        }
        return random;
    }

    public static void main(String[] args) {

        String s = nAleatorio().repeat(5);
        System.out.println(" " + s);



    }


}
