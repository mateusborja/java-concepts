package com.mateusborja.javainterfaces.ex01;

public class Lamborguini implements Carro, ItemCaro {

    private static String marca;
    private static String modelo;

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
        return 100000;
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setMarca(String marca) {
        Lamborguini.marca = marca;
    }

    public static void setModelo(String modelo) {
        Lamborguini.modelo = modelo;
    }
}
