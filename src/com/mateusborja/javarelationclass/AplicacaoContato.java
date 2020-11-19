/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarelationclass;

public class AplicacaoContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        Endereco end1 = new Endereco();
        Telefone tel1 = new Telefone();
        Telefone tel2 = new Telefone();

        end1.setRua("Rua Francisco Arruda");
        end1.setNumero("09");
        end1.setCidade("Manaus");

        tel1.setTipo("tasa");
        tel1.setDdd("92");
        tel1.setNumero("982218078");

        tel2.setTipo("trabalho");
        tel2.setDdd("82");
        tel2.setNumero("36788078");

        Telefone[] telefones = new Telefone[2];

        telefones[0] = tel1;
        telefones[1] = tel2;


        //objt contato set Array => telefones
        contato.setTelefones(telefones);
        //verif null exception
        if (end1 != null) {
            System.out.println(end1.toString() + "\n" + tel1.toString());
        }

        //verif null exception
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getDdd() + t.getNumero());
            }
        }



    }
}
