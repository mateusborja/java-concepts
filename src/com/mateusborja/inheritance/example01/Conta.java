package com.mateusborja.inheritance.example01;

public class Conta {

    protected double saldo;
    protected Conta conta;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {

            this.saldo -= valor;

        } else {
            System.out.println("Você não possui saldo.");
        }

    }

    public void verSaldo() {
        System.out.printf("Seu saldo é de R$ %.2f%n", getSaldo());
    }

    public void juros() {
        this.saldo -= 1.075;
    }

    public double getSaldo() {
        return saldo;
    }
}

