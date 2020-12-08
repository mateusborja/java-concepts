/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapolymorphism.ex01;

public class Aplicacao {

    public static void main(String[] args) {

        Preparador preparador = new Preparador();

        LeiteQuente leiteQuente = new LeiteQuente();
        preparador.prepararBebida(leiteQuente);

        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);

        SucoNatural sucoNatural = new SucoNatural();
        preparador.prepararBebida(sucoNatural);

        Cerveja cerveja = new Cerveja();
        preparador.prepararBebida(cerveja);


    }
}
