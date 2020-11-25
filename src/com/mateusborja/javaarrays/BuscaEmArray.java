/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaarrays;

import java.util.Scanner;

public class BuscaEmArray {

    public static boolean buscaEmArray(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int x = 0;
        while (x < 10) {
            System.out.print("Digite o " + (x + 1) + "o número: ");
            arr[x] = sc.nextInt();
            x++;
        }
        System.out.print("Coleção: ");
        for (int array : arr) {
            System.out.print(array + " ");
        }

        System.out.println();
        System.out.print("Buscar por: ");
        int busca = sc.nextInt();
        boolean resultado = buscaEmArray(busca, arr);
        //System.out.println(resultado);

        if (resultado) {
            System.out.print("Busca Realizada! Resultado: " + busca);
        } else {
            System.out.print("Busca Realizada! Resultado: Não Encontrado!");
        }

        sc.close();


    }

}
