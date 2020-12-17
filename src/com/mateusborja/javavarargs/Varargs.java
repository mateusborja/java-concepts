/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavarargs;

public class Varargs {

    public static void main(String[] args) {

        System.out.println("sum prt: " + sum(1, 4));

        int[] arr = {1, 4, 6, 10};
        System.out.println("sum arr: " + sum(arr));

        System.out.println("sum varargs: " + sum(32, 4, 3, 23, 43, 5));



    }


    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int sum(Integer... integers) {
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum = integers[i];
        }
        return sum;
    }


}
