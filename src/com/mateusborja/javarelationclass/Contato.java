/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarelationclass;

public class Contato {

    private Endereco endereco;
    private Telefone[] telefones;


    public Endereco getEndereo() {
        return endereco;
    }

    public void setEndereo(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "End: " + endereco + ", "+ "Telefone: " + telefones;
    }
}
