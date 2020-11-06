package com.mateusborja.javaifelse;

import java.util.Scanner;

public class PessoaSuspeita {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Telefonou para a Vítima? S/N: ");
        String resp1 = sc.next();

        System.out.print("Esteve no local do crime? S/N: ");
        String resp2 = sc.next();

        System.out.print("Mora perto da vítima? S/N: ");
        String resp3 = sc.next();

        System.out.print("Já trabalhou com a vítima? S/N: ");
        String resp4 = sc.next();

        System.out.print("Devia para a vítima? S/N: ");
        String resp5 = sc.next();

        int ct = 0;

        if (resp1.equalsIgnoreCase("s")) {
            ct++;
        }

        if (resp2.equalsIgnoreCase("s")) {
            ct++;
        }

        if (resp3.equalsIgnoreCase("s")) {
            ct++;
        }

        if (resp4.equalsIgnoreCase("s")) {
            ct++;
        }

        if (resp5.equalsIgnoreCase("s")) {
            ct++;
        }

        if (ct == 0 || ct == 1) {
            System.out.println("\noINOCENTE!");

        } else if (ct == 2) {
            System.out.println("\nVocê é SUSPEITO!");
        } else if (ct == 3 || ct == 4) {
            System.out.println("\nVocê pode ser \"CÚMPLICE\" do Crime!");
        } else if (ct == 5) {
            System.out.println("\nVocê é o ASSASSINO!");
        }
    }
}
