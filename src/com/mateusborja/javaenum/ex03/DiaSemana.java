/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex03;

public enum DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);


    private final int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
