/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex03;

public class AplicacaoData {

    public static void main(String[] args) {

        Data dataNascimento = new Data(17, 3,1978, DiaSemana.SEGUNDA);

        System.out.println("Nascimento MB: " + dataNascimento);

    }
}
