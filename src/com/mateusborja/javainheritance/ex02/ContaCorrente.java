/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javainheritance.ex02;

public class ContaCorrente extends Conta {

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        this.juros();
    }

    public void juros() {
        this.saldo -= 0.025;
    }


}
