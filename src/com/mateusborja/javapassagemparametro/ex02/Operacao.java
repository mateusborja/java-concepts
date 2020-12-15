/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapassagemparametro.ex02;

public class Operacao {

    void trocar(int n) {
        n = 20;
    }

    void alterarValor(Valor valor) {
        valor.v = 20;
    }

    void alteraValorNovo(Valor valor) {
        valor = new Valor();
        valor.v = 20;
    }
}
