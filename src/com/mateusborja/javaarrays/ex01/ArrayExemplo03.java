/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex01;

public class ArrayExemplo03 {


    public int somar(int[] vetInteiros) {

        int total = 0;

        for (int i = 0; i < vetInteiros.length; i++) {
            total += vetInteiros[i];

        }
        return total;
    }

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int somar(int[] num1, int[] num2) {

        int num1Total = 0;
        int num2Total = 0;

        for (int i = 0; i < num1.length; i++) {
            num1Total += num1[i];
        }

        for (int j = 0; j < num2.length; j++) {
            num2Total += num2[j];
        }

        return num1Total + num2Total;

    }

    public static void main(String[] args) {

        ArrayExemplo03 arr1 = new ArrayExemplo03();

        int[] vet1 = {25, 43, 32, 32, 222, -100};
        int[] vet2 = {1, 2, 3, 4, 5, 6, 100};

        int sum1 = arr1.somar(vet1);
        System.out.println("soma vet1 " + sum1);


        int sum2 = arr1.somar(vet2);
        System.out.println("soma vet2 é " + sum2);

        int sum3 = arr1.somar(vet1, vet2);
        System.out.println("vet1 + vet2 é " + sum3);

    }

}
