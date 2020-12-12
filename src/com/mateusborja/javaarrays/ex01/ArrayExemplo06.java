/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex01;

import java.util.Random;

public class ArrayExemplo06 {

    public static void main(String[] args) {

        String[] textos = new String[1];

        String texto =
                "Para obter novos conhecimentos e aplica-los no dia a dia. Sou iniciante em Java e gostaria de obter a bolsa de estudos. Preciso fazer esse curso para conseguir " +
                        "um emprego em ti Estou iniciando nessa area e acredito que a Cousera oferece excelentes cursos. Gostaria muito de poder fazer e esse curso e deixo com " +
                        "vocês a possibilidade de autorizar. Obrigado ";
        textos[0] = texto;

        for (String t : textos) {
            System.out.println(" " + t.length());

        }

        String n1 = nRandom().repeat(5);
        System.out.println(" " + n1);


    }

    public static String nRandom() {

        String[] s = {"10", "20", "30", "40", "50"};
        Random r = new Random();
        String random = " ";
        for (int i = 0; i < 4; i++) {
            random = random + s[r.nextInt(s.length)];
            System.out.println(" " + random);
        }

        return random;
    }

}












