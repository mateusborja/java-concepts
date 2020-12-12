/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex02;

import java.util.ArrayList;

public class PercorrendoArrays {

    public static void main(String[] args) {

        String arr[] = new String[5];
        ArrayList<String> arrList = new ArrayList<String>();

        arr[0] = "Mateus Borja";
        arr[1] = "Developer";
        arr[2] = "UX Designer";
        arr[3] = "3D Artist";
        arr[4] = "Enthusiasm Speaker";

        arrList.add(arr[0]);
        arrList.add(arr[1]);
        arrList.add(arr[2]);
        arrList.add(arr[3]);
        arrList.add(arr[4]);

        for (String s : arr) {
            try {
                if (s != null) {
                    System.out.println(arrList.get(0) + " tem => " + arrList.get(0).length() + " caracteres");
                    System.out.println(arrList.get(1) + " tem => " + arrList.get(1).length() + " caracteres");
                    System.out.println(arrList.get(2) + " tem => " + arrList.get(2).length() + " caracteres");
                    System.out.println(arrList.get(3) + " tem => " + arrList.get(3).length() + " caracteres");
                    System.out.println(arrList.get(4) + " tem => " + arrList.get(4).length() + " caracteres");
                    break;
                } else {

                    return;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
