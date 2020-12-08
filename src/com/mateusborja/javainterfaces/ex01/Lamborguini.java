/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javainterfaces.ex01;

public class Lamborguini implements Carro, ItemCaro {

    private String marca;
    private String modelo;

    @Override
    public void virarEsquerda() {
        System.out.println("Lamborguini virou a Esquerda.");
    }

    @Override
    public void virarDireita() {
        System.out.println("Lamborguini virou a Direita.");

    }

    @Override
    public void acelerar() {
        System.out.println("Lamborguini Acelerou.");

    }

    @Override
    public void frear() {
        System.out.println("Lamborguini Freou.");

    }

    @Override
    public void abrirPorta() {
        System.out.println("Lamborguini abriu a Porta.");
    }

    @Override
    public double getPreco() {
        return 4500000;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
