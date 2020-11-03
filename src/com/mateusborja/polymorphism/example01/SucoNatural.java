package com.mateusborja.polymorphism.example01;

public class SucoNatural extends Bebida {

    SucoNatural(){
        super("Suco Natural", false);
    }


    @Override
    public void preparar() {
        System.out.println("Pegando o copo");
        System.out.println("Colocando a bebida no copo");

    }


}
