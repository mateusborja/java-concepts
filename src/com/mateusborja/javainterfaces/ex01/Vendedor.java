package com.mateusborja.javainterfaces.ex01;

public class Vendedor {

    public void mostrarPreco(ItemCaro item) {
        System.out.println("O Valor é R$ " + item.getPreco());
    }


    public void mostrarCarro(Ferrari ferrari) {
        System.out.println("Ferrari" + ferrari);

    }
}
