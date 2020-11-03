//java array simple de numeros com casa decimal

package com.mateusborja.arrayexample01;

import java.util.Locale;
import java.util.Scanner;

public class ArrayExemplo02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde de elementos do array: ");
        int n = sc.nextInt();

        System.out.println("\nelementos da coleção: ");
        double[]vet = new double[n];

        for (int i = 0; i < n; i++) { //lendo meu array
            vet[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) { //imprimindo meu array
            System.out.printf("[%.1f] ", vet[i]);

        }

        sc.close();


    }
}
