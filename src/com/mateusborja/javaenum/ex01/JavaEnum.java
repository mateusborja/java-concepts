/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

//java enum
package com.mateusborja.javaenum.ex01;

public class JavaEnum {

    public enum DiasdaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA;
    }

    public enum FinaisdeSemana {
        SABADO, DOMINGO;
    }


    public static void main(String[] args) {

        DiasdaSemana d1 = DiasdaSemana.QUARTA;

        switch (d1) {
            case SEGUNDA:
                System.out.println("segunda-feira");
                break;

            case QUARTA:
                System.out.println("quarta-feira");
                break;

            default:
                System.out.println("invalido");

        }


        FinaisdeSemana f1 = FinaisdeSemana.SABADO;

        int i = switch (f1) {
            case SABADO -> 7;
            case DOMINGO -> 1;
            default -> 3;
        };

        System.out.println(i);

        FinaisdeSemana f2 = FinaisdeSemana.DOMINGO;

        switch (f2) {
            case SABADO -> System.out.println("sab");
            case DOMINGO -> System.out.println("dom");
            default -> System.out.println("outro valor");
        }





    }

}
