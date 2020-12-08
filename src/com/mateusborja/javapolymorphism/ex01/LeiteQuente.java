/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapolymorphism.ex01;

public class LeiteQuente extends Bebida {

    LeiteQuente() {
        super("Leite", true);

    }

    @Override
    public void preparar() {
        System.out.println("Pegando o copo...");
        System.out.println("Colocando o leite no copo..." );
    }
}
