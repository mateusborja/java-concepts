/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

public class ClasseTesteVetor {

    public static void main(String[] args) {

        Vetor arr = new Vetor(8);
        arr.adicionarVetor("Elemento 1");
        arr.adicionarVetor("Elemento 2");
        arr.adicionarVetor("Elemento 3");
        arr.adicionarVetor("Elemento 4");

        System.out.println(arr);

        System.out.println("todos os vetores: " + arr.imprimirVetores());





    }


}
