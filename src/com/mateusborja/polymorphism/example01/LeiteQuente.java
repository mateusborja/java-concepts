package com.mateusborja.polymorphism.example01;

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
