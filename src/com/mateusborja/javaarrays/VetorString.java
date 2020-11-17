/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays;

public class VetorString {

    public static void main(String[] args) {


        String palavra = "Texto Separaodo";
        String[] partes = palavra.toUpperCase().split(" ");
        int retirar = 0;
        boolean retirou = true;

        while (retirou) {
            retirou = false;
            for (String str : partes) {
                if (retirar < str.length()) {
                    System.out.print(str.substring(0, str.length() - retirar) + " ");
                    retirou = true;
                }
            }
            System.out.println();
            retirar++;
        }


    }
}
