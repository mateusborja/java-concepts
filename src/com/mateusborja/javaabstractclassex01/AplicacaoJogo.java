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
        System.out.println(mc.getPosX() + " unidades em X");

        Cogumelo c1 = new Cogumelo();
        c1.pegar();

        Item d2 = new Diamante(); //Classe abstrata fazendo referencia - variavel d2 do tipo Item
        d2.pegar();

    }
}
