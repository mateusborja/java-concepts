//java array bidimensional
package com.mateusborja.forexample01;

import java.util.Locale;
import java.util.Scanner;

public class ForExample04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do array: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("numeros do array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(mat[i][j] + " ");

            }

            System.out.println();

        }

        sc.close();
    }
}
