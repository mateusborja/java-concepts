/* java array simples
/* de numeros inteiros
 */

package com.mateusborja.arrayexample01;

import java.util.Scanner;

public class ArrayExemplo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qtde numeros na coleção: ");
        int n = sc.nextInt();
        int [] vet = new int[n];

        System.out.print("digite os numeros da coleção: ");
        for (int i = 0; i < n; i++) { //lendo array
            vet[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < n; i++) { //imprimindo os arrays
            System.out.print(vet[i] + " ");

        }

        sc.close();

    }
}
