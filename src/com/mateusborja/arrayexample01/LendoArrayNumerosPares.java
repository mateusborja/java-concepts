// lendo array e imprimindo numeros pares
package com.mateusborja.arrayexample01;

import java.util.Locale;
import java.util.Scanner;

public class LendoArrayNumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde de numeros no array: ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        System.out.println("numeros do array: ");
        for (int i = 0; i < n; i++) { // lendo array
            vet[i] = sc.nextInt();
        }

        System.out.println(); // concatenando com quebra de linha
        System.out.print("pares do array: "); // imprimindo
        for(int i = 0; i < n; i++) {  // lendo para imprimir
            if(vet[i] % 2 ==0) { //condicao de numero par
                System.out.printf("[ %.1f ] ", vet[i]); // imprimindo os pares
            }
        }

    }
}
