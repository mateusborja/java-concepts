/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javagetset;

public class Contato  {

    private String nomeCompleto;
    private String telefone;
    private String endereco;

    public Contato() {

    }

    public Contato(String nomeCompleto, String telefone, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "[" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                "]";
    }
}
