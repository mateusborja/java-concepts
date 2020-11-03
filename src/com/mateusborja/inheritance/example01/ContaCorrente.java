package com.mateusborja.inheritance.example01;

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
