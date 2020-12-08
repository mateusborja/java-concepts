/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javainterfaces.ex01;

public class Vendedor {

    public void mostrarPreco(ItemCaro item) {
        System.out.println("R$ " + item.getPreco());
    }

    public void mostrarPreco(ItemBarato item) {
        System.out.println("R$ " + item.getPreco());
    }

}
