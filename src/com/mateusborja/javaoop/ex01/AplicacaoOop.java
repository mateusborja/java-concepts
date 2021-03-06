/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaoop.ex01;

public class AplicacaoOop {

    public static void main(String[] args) {
        Geladeira geladeira1 = new Geladeira(110, true);

        Radio radio1 = new Radio(110);

        radio1.ligar();
        radio1.setSintonia(99.1f);
        radio1.setVolume(69);
        System.out.print("O Radio está ");
        System.out.print(radio1.isLigado() ? "ligado " : " desligado ");
        System.out.println("e \"Sintonizado\" em " + radio1.getSintonia() + " com volume bem alto... volume = " + radio1.getVolume());

        geladeira1.ligar();
        geladeira1.setModelo("Brastemp");

        System.out.print("\nA Geladeira " + geladeira1.getModelo());
        System.out.println(geladeira1.isLigado() ? " está ligada." : "desligada.");

    }
}
