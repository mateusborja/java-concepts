/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarraylist;

import java.util.ArrayList;

public class ArrayListEx02 {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>(5);

        arrList.add("Mateus Borja");
        arrList.add("Java Developer");
        arrList.add("C/C++ Developer");

        System.out.println("Mateus Borja tem: " + arrList.get(0).length() + " caracteres.");


        int sum = 0;
        for (String a : arrList) {
            System.out.println(a.length());
            sum += a.length();
        }
        System.out.println("Soma dos Caracteres: " + sum);

        ArrayList<Integer> arrListInt = new ArrayList<Integer>();

        arrListInt.add(3);
        arrListInt.add(13);
        arrListInt.add(23);
        arrListInt.add(33);
        arrListInt.add(43);

        System.out.println(arrListInt);
        System.out.println(arrListInt.size() * 2);




    }
}
