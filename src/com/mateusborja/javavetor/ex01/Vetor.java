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
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return "[ " + this.elementos[posicao] + " ]";
    }

    //verificar se um elemento existe no vetor retornao uma string
    public String buscarVetorExistente(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return "Posição: [ " + i + " ]";
            }

        }
        return "Posição inexistente";
    }

    //metodo que busca se um elemento existe em um vetor e retorna um booleano
    public boolean buscarVetorExistenteOp2(String elemento) {
        try {

            for (int i = 0; i < this.elementos.length; i++) {
                if (this.elementos[i].equals(elemento)) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Elemento não Existe");

        }
        return false;
    }

    //metodo que busca se um elemento existe e retorna a posição
    public int buscarVetorExistenteOp3(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }

        }
        return -1;
    }

    //metodo q adiciona elemento em qlqr posicao do vetor
    // 0 1 2 3 4 5 = tamanho 5
    // B C E F G + + // adicionar A indice 0
    public boolean adicionarVetorQlqrPos(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        //i = 5  = primeira passa 4 - mover todos os elementos
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }


}
