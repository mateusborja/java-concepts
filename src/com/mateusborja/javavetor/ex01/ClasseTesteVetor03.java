/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

public class ClasseTesteVetor03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adicionarVetor("Borja");
        vetor.adicionarVetor("Mateus");

        System.out.println(vetor);
        System.out.println(vetor.buscarVetorExistente("borja"));





    }
}
