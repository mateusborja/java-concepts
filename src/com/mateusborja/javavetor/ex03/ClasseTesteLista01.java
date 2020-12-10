/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex03;

public class ClasseTesteLista01 {


    public static void main(String[] args) {


        Lista<Integer> listaInt = new Lista<Integer>(5);

        listaInt.adicionarVetor(4);
        listaInt.adicionarVetor(0);
        listaInt.adicionarVetor(1);
        listaInt.adicionarVetor(2);
        listaInt.adicionarVetor(7);


        System.out.println(listaInt.imprimirVetores());

        Lista<String> listaStr = new Lista<String>(3);

        listaStr.adicionarVetor("mb");
        listaStr.adicionarVetor("java");
        listaStr.adicionarVetor("c++");

        System.out.println(listaStr);

        Lista<Contato> listaContato = new Lista<Contato>(4);
        Contato c1 = new Contato("Mateus Borja", "92 98221 8078", "hello@mateusborja.com");
        Contato c2 = new Contato("Joao Honorio", "34 99904 0444 ", "joao@mail.com");

        listaContato.adicionarVetor(c1);
        listaContato.adicionarVetor(c2);
        System.out.println(listaContato);


    }
}
