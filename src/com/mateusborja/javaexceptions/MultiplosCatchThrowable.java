/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaexceptions;

public class MultiplosCatchThrowable {

    public static void main(String[] args) {

        int arr1[] = {2, 4, 8, 12, 24};
        int arr2[] = {1, 0, 2, 6};

        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));
                System.out.println("executando");

            } catch (ArithmeticException e) { //catch especitifo
                System.out.println("erro 1");
                System.out.println(e.getMessage());
                e.printStackTrace();

            } catch (Throwable t) { // catch generico // pratica n mt boa, utilizar Execetption
                System.out.println("erro 2");
            }

        }


    }
}
