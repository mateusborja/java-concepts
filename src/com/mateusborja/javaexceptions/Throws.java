/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaexceptions;

import java.util.Scanner;

public class Throws {

    public static void main(String[] args) {

        double num = 0;
        try {
            num = leNumero();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("voce digitou: " + num);
    }


    public static double leNumero() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        double num = sc.nextDouble();
        sc.close();
        System.out.println();
        return num;
    }
}
