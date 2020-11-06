package com.mateusborja.javaifelse;

import java.util.Locale;
import java.util.Scanner;

public class ContabilidadeGasolina {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double descontoAlcool = 0;
        double descontoGalosina = 0;
        double valorGasolina = 2.50;
        double valorAlcool = 1.90;
        double total = 0.0;
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
                descontoAlcool = 3.0;
                alcool = true;
                gasolina = false;

            } else if (litrosVendidos > 20.0) {
                descontoAlcool = 5.0;
                alcool = true;
                gasolina = false;
            }

        }

        if (tipoCombustivel.equalsIgnoreCase("G")) {

            if (litrosVendidos <= 20.0) {
                descontoGalosina = 4.0;
                gasolina = true;
                alcool = false;

            } else if (litrosVendidos > 20.0) {
                descontoGalosina = 6.0;
                gasolina = true;
                alcool = false;
            }

        }

        if (gasolina == true) {
            total = litrosVendidos * valorGasolina;
            valorDesconto = (total / 100) * descontoGalosina;
            valorPagar = total - valorDesconto;

            System.out.printf("%nValor pago: R$ %.2f%n", valorPagar);
        }

        if (alcool == true) {
            total = litrosVendidos * valorAlcool;
            valorDesconto = (total / 100) * descontoGalosina;
            valorPagar = total - valorDesconto;
            System.out.printf("%nValor pago: R$ %.2f%n", valorPagar);

        }

        sc.close();

    }

}


