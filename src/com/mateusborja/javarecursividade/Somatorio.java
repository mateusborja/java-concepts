/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javarecursividade;

import java.util.Scanner;

public class Somatorio {


    public static int somatorioDeUmNumero(int num) {

        if (num == 1) {
            return 1;
        }
        return num + somatorioDeUmNumero(num - 1);
    }


    public static void main(String[] args) {


        Scanner r = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num = r.nextInt();

        System.out.println("somatorio de " + num + " é: " + somatorioDeUmNumero(num));


    }


}
