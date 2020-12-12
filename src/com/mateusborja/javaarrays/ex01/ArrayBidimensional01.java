/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays.ex01;

import java.util.Locale;
import java.util.Scanner;

public class ArrayBidimensional01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("numeros da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");

        }

        System.out.println();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += mat[i][i];
        }
        System.out.println("\n" + "soma da diagonal principal: " + soma);

    }

}
