/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javawrappers;

import java.text.DecimalFormat;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class AutoboxingUnboxing {

    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat();

        //autoboxing
        Short num1 = 1;
        Byte num2 = 13;
        Integer num3 = 5;
        Long num4 = 155555l;
        Float num5 = 3.5f;
        Double num6 = 16.0;

        //autounboxing
        int m1 = num3;
        double m2 = num6;

        System.out.println(m1);
        System.out.println(pow(num3, 2));

        System.out.println(dc.format(sqrt(m2)));

        //mal uso do autoboxing
        //usar tipos primitivos double
        Double a = 3.0;
        Double b = 4.0;
        Double media = (a + b) / 2;
        System.out.println("media: " + media);


    }
}
