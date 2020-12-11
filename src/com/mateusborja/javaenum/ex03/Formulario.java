/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex03;

public class Formulario {

    private String nome;
    private Genero genero;


    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "[" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                "]";
    }

    enum Genero {
        MASCULINO('M'), FEMININO('F');

        public final char valor;

        Genero(char valor) {
            this.valor = valor;
        }

    }
}
