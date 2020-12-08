/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

public class ClasseTesteVetorObject01 {

    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(5);

        vetor.adicionarVetor(3);
        vetor.adicionarVetor(1);
        vetor.adicionarVetor(5);
        vetor.adicionarVetor(8);

        System.out.println(vetor);

        Contato c1 = new Contato("Mateus Borja", "92 98221 8078", "hello@mateusborja.com");
        Contato c2 = new Contato("Joao Honorio", "69 98767 7899", "joao@@gmail.com");

        vetor.adicionarVetor(c1);
        vetor.adicionarVetor(c2);

        System.out.println(vetor);
        System.out.println(vetor.tamanhoDoVetor());

        vetor.removerElementoQlqr(4);
        vetor.removerElementoQlqr(5);
        System.out.println(vetor);






    }
}
