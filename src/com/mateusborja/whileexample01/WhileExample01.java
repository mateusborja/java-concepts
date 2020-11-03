package com.mateusborja.whileexample01;

import java.util.Scanner;

public class WhileExample01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades:");

        int idade = sc.nextInt();

        int soma = 0;
        int cont = 0;

        while (idade >=0) {
            soma += idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("A media das idades é: %.2f%n", media);
        } else
            System.out.println("Valor inválido");


        sc.close();
    }

}
