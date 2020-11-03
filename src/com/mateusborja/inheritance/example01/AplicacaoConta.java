package com.mateusborja.inheritance.example01;

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
