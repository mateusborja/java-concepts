package com.mateusborja.javaoperadoresdecremento;

public class OperadoresDecremento {

    public static void main(String[] args) {

        int x = 10, y = 0;

        System.out.println("Valor de x antes do decremento: " + x + "\n");

        y = x--; // decremento pos-fixo
        System.out.println("Valor de y apos o decremento: " + y);
        System.out.println("Valor de x apos o decremento: " + x + "\n");

        x = 10; y = 0;
        int m = x;

        x--; // pos-fixo
        ++y; // pre-fxo
        System.out.println("Valor de m apos do decremento: " + m);
        System.out.println("Valor de x apos do decremento: " + x);
        System.out.println("Valor de y apos o incremento: " + y + "\n");





    }

}
