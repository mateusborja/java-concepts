/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapolymorphism.ex01;

public class Bebida {

    private String nome;
    private boolean aquecer;

    Bebida(String nome, boolean aquecer) {
        this.nome = nome;
        this.aquecer = aquecer;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAquecer() {
        return aquecer;
    }

    public void preparar(){

    }
}

