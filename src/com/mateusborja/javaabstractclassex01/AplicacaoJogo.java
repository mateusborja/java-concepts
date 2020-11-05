package com.mateusborja.javaabstractclassex01;

public class AplicacaoJogo {

    public static void main(String[] args) {

        Diamante d1 = new Diamante();
        d1.pegar();

        Moeda m1 = new Moeda();
        m1.pegar();

        Maca mc = new Maca();
        mc.pegar();

        mc.setPosX(45);
        System.out.println(mc.getPosX() + " metros em X");

        Item d2 = new Diamante();
        d2.pegar();

    }
}
