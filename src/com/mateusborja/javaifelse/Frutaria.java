package com.mateusborja.javaifelse;

import java.util.Scanner;

public class Frutaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("qtd morango em Kg: ");
        double qtdMorango = sc.nextDouble();

        System.out.print("qtd maça em Kg: ");
        double qtdMaca = sc.nextDouble();

        double precoKgMorango = 0.0;
        double precoKgMaca = 0.0;

        if (qtdMorango <= 5) {
            precoKgMorango = 12.0; // vlr do kg;

        } else {
            precoKgMorango = 15.0; // vlr do kg;
        }

        if (qtdMaca <= 5) {
            precoKgMaca = 5.8;
        } else {
            precoKgMaca = 6.8;

        }

        double prectoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca) > 8 || precoParcial > 25) {
            precoTotal = precoParcial - (precoParcial / 100) * 10.0;
        }

        System.out.printf("%nTotal a pagar: R$ %.2f%n", precoTotal);

        sc.close();


    }
}
