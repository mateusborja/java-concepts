/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaescopo.ex01;

public class EscopoVariaveis {

    private int valor;

    public EscopoVariaveis() {
        super();
    }

    public EscopoVariaveis(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor) {
        valor = valor + 10;
        return valor;
    }

    public void incrementa() {
        int valor = 1;

        if (valor < 10) {
            for (int i = 0; i < 10; i++) {
                valor++;
                System.out.print(valor + " ");
            }
        }
    }

    public int decrementa() {
        int valor = 5;
        if (true) {
            valor--;
        }
        return valor;
    }
}

