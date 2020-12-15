/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaescopo.ex01;

public class AplicacaoEscopoVariaveis {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis(20);

        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValor(20));

        escopo.incrementa();
        System.out.println();
        System.out.println(escopo.decrementa());

    }
}
