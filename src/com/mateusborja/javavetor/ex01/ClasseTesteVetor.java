/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

public class ClasseTesteVetor {

    public static void main(String[] args) {

        Vetor arr = new Vetor(8);
        arr.adicionarVetor("desenvolvimento java");
        arr.adicionarVetor("teste1");
        arr.adicionarVetor("teste2");
        arr.adicionarVetor("mateus");

        System.out.println(arr);

        System.out.println("todos os vetores: " + arr.imprimirVetores());

        System.out.println(arr.buscarVetor(3));

        System.out.println(arr.buscarVetorExistente("mateus"));

        System.out.println(arr.buscarVetorExistenteOp2("teste1")); // retorna um booleano

        System.out.println(arr.buscarVetorExistenteOp3("teste1")); // retorna o indice





    }


}
