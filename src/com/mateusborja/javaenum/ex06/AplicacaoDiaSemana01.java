/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex06;

public class AplicacaoDiaSemana01 {

    public static void main(String[] args) {

        DiaSemana dias[] = DiaSemana.values();

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        System.out.println();
        for (DiaSemana d : dias) {
            System.out.println(d.getDia());
        }

    }

}
