package com.mateusborja.javaarraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {

    public static void main(String[] args) {

        String[] nomes = {"Joao", "Ledinha", "Ligia", "Joana"};
        List lista = Arrays.asList(nomes);

        if (nomes.length + 1 > 3) {
            System.out.println("Correto.");

        } else {
            System.out.println("Erro a lista é: " + lista.toString());
        }

        nomes[1] = "Novo nome Mateus";
        System.out.println("Lista Completa: " + lista);

        System.out.println("Alteração: "+ lista.get(1));


    }
}
