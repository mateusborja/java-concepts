/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex02;

import java.util.ArrayList;

public class PercorrendoArraysInt {

    public static void main(String[] args) {

        ArrayList<Integer> arrListInt = new ArrayList<Integer>();
        int nums[];
        nums = new int[5];

        nums[0] = 1889;
        nums[1] = 2056;
        nums[2] = 3454;
        nums[3] = 4564;
        nums[4] = 5056;

        for (int i = 0; i < nums.length; i++) {
            arrListInt.add(nums[i]);
        }

        int count = 0;

        for (Integer i: arrListInt) {
            count += i.intValue();
        }
        System.out.println("sum arrList is: " + count);



    }
}
