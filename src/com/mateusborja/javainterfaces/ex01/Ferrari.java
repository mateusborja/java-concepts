package com.mateusborja.javainterfaces.ex01;

public class Ferrari implements Carro, ItemCaro {

    private static String marca;
    private static String modelo;


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
        return 10000;
    }

    public static void setMarca(String marca) {
        Ferrari.marca = marca;
    }

    public static void setModelo(String modelo) {
        Ferrari.modelo = modelo;
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModelo() {
        return modelo;
    }
}
