package com.mateusborja.javaifelse;

import java.util.Locale;
import java.util.Scanner;

public class CalcularodaSimplesIDNumero {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("numero um = ");
        double num1 = sc.nextDouble();

        System.out.print("numero um = ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean validar = true;

        System.out.println("escolha a operacao: + - * /");
        String operacao = sc.next();

        if (operacao.length() > 1) {
            System.out.println("operação inválida!");
        }

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("operação inválida.");
                validar = false;
                break;
        }


        if (!validar) {

        } else {
            System.out.printf("resultado: %.2f%n", resultado);
        }

        //flag
        if (validar) {
            if (resultado > 0) {
                System.out.println("número positivo.");
            } else {
                System.out.println("número negativo.");
            }

            if (resultado % 2 == 0) {
                System.out.println("número par.");
            } else {
                System.out.println("número impar.");
            }
        }

    }
}
