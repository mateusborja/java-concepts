/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex06;

public class AplicacaoDiaSemana02 {

    public static void main(String[] args) {

        DiaSemana diaDomingo = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(diaDomingo);

    }
}
