/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex06;

public enum DiaSemana {

    SEGUNDA("Dia 1"), TERÇA("Dia 2"), QUARTA("Dia 3"), QUINTA("Dia 4"), SEXTA("Dia 5"), SÁBADO("Dia 6"), DOMINGO("Dia" +
            " 7");

    private String dia;

    DiaSemana(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}
