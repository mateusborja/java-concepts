package com.mateusborja.javainterfaces.ex01;

public class Vendedor {

    public void mostrarPreco(ItemCaro item) {
        System.out.println("R$ " + item.getPreco());
    }

    public void mostrarPreco(ItemBarato item) {
        System.out.println("R$ " + item.getPreco());
    }

}
