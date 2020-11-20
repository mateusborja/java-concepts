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
        end1.setComplemento("Pq Urbanus");
        end1.setCidade("Manaus");
        end1.setCep("69082820");
        end1.setEstado("Am");

        tel1.setTipo("tasa");
        tel1.setDdd("92");
        tel1.setNumero("982218078");

        tel2.setTipo("trabalho");
        tel2.setDdd("82");
        tel2.setNumero("36788078");

        Telefone[] telefones = new Telefone[2];


        telefones[0] = tel1;
        telefones[1] = tel2;

        contato.setEndereo(end1);
        if (contato != null) {
            System.out.println(contato.getEndereo().getCidade());
        }


        contato.setTelefones(telefones);
        if (end1 != null) {
            System.out.println(end1.toString() + "\n" + tel1.toString());
        }

        //verif null exception
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone telefone : contato.getTelefones()) {
                System.out.println(telefone.getDdd() + " " + telefone.getDdd() + telefone.getNumero());
            }
        }


    }
}
