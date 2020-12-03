/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

public class ClasseTesteVetor02 {

    public static void main(String[] args) {


        Vetor vetor = new Vetor(10);

        vetor.adicionarVetor("B");
        vetor.adicionarVetor("C");
        vetor.adicionarVetor("E");
        vetor.adicionarVetor("F");
        vetor.adicionarVetor("G");

        System.out.println(vetor);

        vetor.adicionarVetorQlqrPos(0, "A");
        System.out.println(vetor);

        vetor.adicionarVetorQlqrPos(3, "D");
        System.out.println(vetor);




    }
}
