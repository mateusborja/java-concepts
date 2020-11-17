/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

//soma dos numeros digitados ate zero
package com.mateusborja.javawhile;

import java.util.Scanner;

public class JavaWhileExemplo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite numeros que deseja somar, no final digite zero:  ");
        int x = sc.nextInt();

        int soma = 0;
        while (x !=0) {
            soma += x; //soma = soma + x;
            x = sc.nextInt();
        }
        System.out.printf("A soma dos numeros é: %d%n",soma);

        sc.close();

    }
}
