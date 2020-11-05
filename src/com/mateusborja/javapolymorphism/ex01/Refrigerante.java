package com.mateusborja.javapolymorphism.ex01;

public class Refrigerante extends Bebida {

    Refrigerante() {
        super("Refrigerante", false);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando o copo");
        System.out.println("Colocando gelo no copo");
        System.out.println("Colocando refrigerante no copo");
    }


}
