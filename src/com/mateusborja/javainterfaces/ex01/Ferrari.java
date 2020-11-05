package com.mateusborja.javainterfaces.ex01;

public class Ferrari implements Carro, ItemCaro {

    private  String marca;
    private  String modelo;


    @Override
    public void virarEsquerda() {
        System.out.println("Ferrai virou a Esquerda.");
    }

    @Override
    public void virarDireita() {
        System.out.println("Ferrai virou a Direita.");

    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari Acelerou.");

    }

    @Override
    public void frear() {
        System.out.println("Ferrari Freou.");

    }

    @Override
    public void abrirPorta() {
        System.out.println("Ferrari abriu a Porta.");
    }


    @Override
    public double getPreco() {
        return 3500000;
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
