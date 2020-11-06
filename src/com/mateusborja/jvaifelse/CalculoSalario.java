package com.mateusborja.jvaifelse;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("valor / hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        double percentualIR = 0.0;

        if (salarioBruto <= 0) {
            percentualIR = 0.0;

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5.0;

        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20.0;
        }

        double impostoRenda = (salarioBruto / 100.0) * percentualIR;
        double inss = (salarioBruto / 100) * 10.0;
        double fgts = (salarioBruto / 100) * 11.0;

        double totalDescontos = inss + fgts;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("%nSalario Bruto: ( %.1f + * %.1f ) = R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR ( %.1f%%) = R$ %.2f%n", percentualIR, impostoRenda);
        System.out.printf("(-) INSS (10) = RS %.1f%n", inss);
        System.out.printf("(-) FGTS (11) = RS %.1f%n", fgts);
        System.out.printf("(-) Total de Descontos = R$ %.2f", totalDescontos);
        System.out.printf("Salario Liquido = R$ %.2f%n", salarioLiquido);

        sc.close();

    }
}
