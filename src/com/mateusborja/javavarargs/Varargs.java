/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Varargs {

    public static void main(String[] args) {

        System.out.println("sum prt: " + sum(1, 4));

        int[] arr1 = {1, 4, 6, 10};
        System.out.println("sum arr: " + sum(arr1));

        System.out.println("sum varargs: " + sum(32, 4, 3, 23, 43, 5));

        int arr2[] = {23, 43, 4, 54, 3, 2, 1};


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i]);

        }

        List mylist = Arrays.asList(arr2);

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(124);
        arrList.add(1232);
        arrList.add(1);
        arrList.add(122);
        arrList.add(2);
        arrList.add(13);

        Collections.sort(arrList);
        System.out.println("\n" + arrList);




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
