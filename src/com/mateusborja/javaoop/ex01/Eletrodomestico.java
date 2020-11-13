/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

// super class abstract

package com.mateusborja.javaoop.ex01;

public abstract class Eletrodomestico {

    private String nome;
    private double voltagem;
    private boolean lidado;


    public Eletrodomestico(double voltagem, boolean ligado) {
        this.setVoltagem(voltagem);
        this.setLidado(ligado);
    }

    public Eletrodomestico(String nome, double voltagem, boolean ligado) {
        this.setNome(nome);
        this.setVoltagem(voltagem);
        this.setLidado(ligado);
    }

    public abstract void ligar();

    public abstract void desligar();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoltagem(double votagem) {
        this.voltagem = votagem;
    }


    public void setLidado(boolean lidado) {
        this.lidado = lidado;
    }

    public String getNome() {
        return nome;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public boolean isLidado() {
        return lidado;
    }
}
