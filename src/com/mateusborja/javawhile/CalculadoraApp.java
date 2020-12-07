/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javawhile;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 1;

        while (op != 5) {

            System.out.print("\ndigite o numero 1: ");
            int num1 = sc.nextInt();

            System.out.print("digite o numero 2: ");
            int num2 = sc.nextInt();

            System.out.println("\nOPERAÇÃO:");
            System.out.println("1 > somar");
            System.out.println("2 > subtrair");
            System.out.println("3 > multiplicar");
            System.out.println("4 > dividir");
            System.out.println("5 > sair");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("Resultado da Soma: " + somar(num1, num2));

            } else if (op == 2) {
                System.out.println("Resultado da Subtração: " + subtrair(num1, num2));

            } else if (op == 3) {
                System.out.println("Resultado da Multiplicação: " + multiplicar(num1, num2));

            } else if (op == 4) {
                System.out.println("Resultado da Divisão: " + dividir(num1, num2));

            } else if (op == 5) {
                System.out.println("Saindo...");
                System.exit(0);

            } else {
                System.out.println("Opção Inválida");
                System.exit(0);
            }

        }

    }

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }



}
