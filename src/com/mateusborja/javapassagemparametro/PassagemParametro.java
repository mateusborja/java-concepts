/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapassagemparametro;

public class PassagemParametro {

    public static void main(String[] args) {

        Contato contato = new Contato("Contato1", "1234 5678", "End Contato 1");
        int valor = 10;

        System.out.println("***ORIGINALS");
        System.out.println(contato);
        System.out.println(valor);

        passagemParametro(valor, contato);

        System.out.println("***EXEMPLO 1");
        System.out.println(contato);
        System.out.println(valor);

        passagemParametro2(valor, contato);

        System.out.println("***EXEMPLO 2");
        System.out.println(contato);
        System.out.println(valor);


    }

    public static void passagemParametro(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;
        contato = new Contato("Contato2", "2345 6789", "End Contato2");
    }

    public static void passagemParametro2(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;
        contato.setNome("Contato" + novoValor);
    }
}
