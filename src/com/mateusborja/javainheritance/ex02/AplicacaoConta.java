/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javainheritance.ex02;

import java.util.Locale;

public class AplicacaoConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ContaCorrente cc1 = new ContaCorrente();

        cc1.depositar(100);
        cc1.verSaldo();
        cc1.sacar(10);
        cc1.verSaldo();

        cc1.sacar(60);
        cc1.verSaldo();

    }
}
