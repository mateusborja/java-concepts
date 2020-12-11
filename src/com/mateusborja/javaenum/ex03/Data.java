/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex03;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "[" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", diaSemana=" + diaSemana +
                ']';
    }
}
