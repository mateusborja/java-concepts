package com.mateusborja.javapolymorphism.ex01;

public class Preparador {


    public void prepararBebida(Bebida bebida) {

        System.out.println("Preparando a bebida " + bebida.getNome());
        bebida.preparar();

        if (bebida.isAquecer()) {
            System.out.println("Esquentando a bebida " + bebida.getNome());
        }

        System.out.println("A bebida " + bebida.getNome() + " foi preparada com sucesso!!!");
        System.out.println("Agora voce pode beber seu " + bebida.getNome() + " a vontade...\n");

    }
}
