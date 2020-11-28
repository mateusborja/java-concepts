/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaexceptions;

public class MultiplosCatch {

    public static void main(String[] args) {

        int arr1[] = {2, 4, 8, 12, 24};
        int arr2[] = {1, 0, 2, 6};

        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

            } catch (Exception e) {
                System.out.println("erro1 capturado!");
            }


        }


    }
}
