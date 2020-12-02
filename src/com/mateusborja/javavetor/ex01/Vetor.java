/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javavetor.ex01;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int tamanhoDoVetor() {
        return tamanho;
    }

    //adicionar elementos em um vetor
    public boolean adicionarVetor(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }

        return false;
    }

    //imprimir elementos de um vetor
    public String imprimirVetores() {
        return Arrays.toString(elementos);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

    //buscar um elemento em um array
    public String buscarVetor(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return "[ " + this.elementos[posicao] + " ]";
    }

    //verificar se um elemento existe no vetor
    public String buscarVetorExistente(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equalsIgnoreCase(elemento)) {
                return "Posição: [ " + i + " ]";
            }

        }
        return "Posição inexistente";
    }


}
