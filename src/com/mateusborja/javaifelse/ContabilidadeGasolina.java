package com.mateusborja.javaifelse;

import java.util.Locale;
import java.util.Scanner;

public class ContabilidadeGasolina {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percentualAlcool = 0;
        double percentualGalosina = 0;
        double valorGasolina = 2.50;
        double valorAlcool = 1.90;
        double valorSemDesconto = 0.0;
        double valorDesconto = 0.0;
        double valorPagar = 0.0;

        boolean gasolina = false;
        boolean alcool = false;

        System.out.print("qtde de litros vendidos: ");
        double litrosVendidos = sc.nextDouble();

        System.out.print("tipo de combustivel (A-álcool ou G-Gasolina): ");
        String tipoCombustivel = sc.next();

        if (tipoCombustivel.equalsIgnoreCase("A")) {

            if (litrosVendidos <= 20.0) {
                percentualAlcool = 3.0;
                alcool = true;
                gasolina = false;

            } else if (litrosVendidos > 20.0) {
                percentualAlcool = 5.0;
                alcool = true;
                gasolina = false;
            }

        }

        if (tipoCombustivel.equalsIgnoreCase("G")) {

            if (litrosVendidos <= 20.0) {
                percentualGalosina = 4.0;
                gasolina = true;
                alcool = false;

            } else if (litrosVendidos > 20.0) {
                percentualGalosina = 6.0;
                gasolina = true;
                alcool = false;
            }

        }

        if (gasolina == true) {
            valorSemDesconto = litrosVendidos * valorGasolina;
            valorDesconto = (valorSemDesconto / 100) * percentualGalosina;
            valorPagar = valorSemDesconto - valorDesconto;

            System.out.printf("%nValor pago: R$ %.2f%n", valorPagar);
        }

        if (alcool == true) {
            valorSemDesconto = litrosVendidos * valorAlcool;
            valorDesconto = (valorSemDesconto / 100) * percentualGalosina;
            valorPagar = valorSemDesconto - valorDesconto;
            System.out.printf("%nValor pago: R$ %.2f%n", valorPagar);

        }

        sc.close();

    }

}


