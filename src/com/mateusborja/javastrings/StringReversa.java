/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javastrings;

public class StringReversa {

    public static void main(String[] args) {


        String name = "The skye is blue";
        char [] arr = name.toCharArray();


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        System.out.println();

        for (int j = arr.length -1; j >=0 ; j--) {
            System.out.print(arr[j]);

        }

    }


}
