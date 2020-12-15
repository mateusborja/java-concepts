/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javawrappers;

import java.text.DecimalFormat;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ClassesWrappers {

    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat();

        //classes wrappers
        Short m1 = new Short((short) 1);
        Integer m2 = new Integer(10);
        Double m3 = new Double(4.5);
        Boolean flag2 = new Boolean(false);

        //autoboxing
        Short num1 = 1;
        Byte num2 = 13;
        Integer num3 = 6;
        Long num4 = 155555l;
        Float num5 = 3.5f;
        Double num6 = 2.5;

        Boolean flag = true;
        Character a = 'a';

        //autounboxing
        int num7 = num3;

        System.out.println(dc.format(pow(num6, num3)));

        System.out.println(dc.format(sqrt(num7)));


    }

}
