/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javastrings;

public class PercorrendoString {

    public static void main(String[] args) {
        String frase = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        String tamanhoString[] = new String[1];
        tamanhoString[0] = frase;

        for (String s : tamanhoString) {
            System.out.println("Caracteres: " + s.length());
        }

    }
}
