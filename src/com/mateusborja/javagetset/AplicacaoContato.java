/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javagetset;

import java.util.ArrayList;

public class AplicacaoContato {

    public static void main(String[] args) {

        ArrayList<Contato> arrListStr = new ArrayList<Contato>();

        Contato c1 = new Contato("Mateus Borja", "92 98221 8078", "Rua Tucano, 09 - Aleixo");
        Contato c2 = new Contato("Joao Honorio", "34 3431 3212", "Rua Sete de Setembro, 444 - Centro");
        Contato c3 = new Contato("Ledinha Honorio", "34 3431 3223", "Rua Antonio da Costa, 144 - EEUA");

        arrListStr.add(c1);
        arrListStr.add(c2);
        arrListStr.add(c3);


        for (Contato c : arrListStr) {
            System.out.println(c.getEndereco());
            System.out.println(c.getTelefone());
        }

    }

}
