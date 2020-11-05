package com.mateusborja.javapolymorphism.ex01;

public class Cerveja extends Bebida {

    Cerveja() {
        super("Cerveja", false);

    }

    @Override
    public void preparar() {
        System.out.println("Pegando a garrafa");
        System.out.println("Abrindo a cerveja");
        System.out.println("Colocando no copo");
    }
}
