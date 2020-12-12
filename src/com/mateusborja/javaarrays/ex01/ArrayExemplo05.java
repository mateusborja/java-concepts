/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex01;

import java.util.Random;

public class ArrayExemplo05 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] array = new int[5];
        int i;
        int sum = 0;

        //numeros aleatorios entre 10 <= 50
        for (i = 0; i < array.length; i++) {
            array[i] = 10 + r.nextInt(40);
            System.out.print(" " + array[i]);
            sum += array[i];
        }

        System.out.println();
        System.out.println("Soma dos aleatorios = " + sum);


    }


}
