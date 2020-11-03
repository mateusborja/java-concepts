//numeros primos e multipos
package com.mateusborja.forexample01;

import java.util.ArrayList;
import java.util.List;

public class ForExampleNumerosPrimos02 {


    private static boolean sePrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listaInversa = new ArrayList<Integer>();
        int i = 1;

        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " é par");
            }else {
                System.out.println("O numero " + i + " é impar");
            }
            if(i % 2 == 0) {
                System.out.println("O numero " + i + " é multiplo 2");
            }
            if(i % 3 == 0) {
                System.out.println("O numero " + i + " é multiplo 3");
            }
            if(i % 4 == 0) {
                System.out.println("O numero " + i + " é multiplo 4");
            }
            if(i % 5 == 0) {
                System.out.println("O numero " + i + " é multiplo 5");
                lista.add(i);
                if(i == 10) {
                    int tamanho = lista.size();
                    for (int l = 0; l < lista.size(); l++) {
                        listaInversa.add(lista.get(tamanho-1));
                        tamanho--;
                    }
                    System.out.println("multiplos de 5 invertidos: " + listaInversa.toString());
                    for (int j = 1; j <= 100; j++) {
                    }
                }
            }
        }

        System.out.println("\nVerificação dos numeros primos: ");
        for (i = 2; i <= 10; i++) {
            if(sePrimo(i))
                System.out.println("O numero " + i + " é primo");
        }
    }
}

