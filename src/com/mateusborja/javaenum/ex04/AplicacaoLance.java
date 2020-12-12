/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex04;

import java.util.Scanner;

public class AplicacaoLance {

    public static void menu() {
        System.out.println("\tBebidas");
        System.out.println("1 => " + Lanche.Bebida.COCA_COLA.getNome() + " R$ " + Lanche.Bebida.COCA_COLA.getPreco());
        System.out.println("2 => " + Lanche.Bebida.FANTA.getNome() + " R$ " + Lanche.Bebida.FANTA.getPreco());
        System.out.println("3 => " + Lanche.Bebida.SPRITE.getNome() + " R$ " + Lanche.Bebida.SPRITE.getPreco());
        System.out.println("4 => " + Lanche.Bebida.AGUA.getNome() + " R$ " + Lanche.Bebida.AGUA.getPreco());
        System.out.println();
        System.out.println("\tComida");
        System.out.println("5 => " + Lanche.Comida.XSALADA.getNome() + " R$ " + Lanche.Comida.XSALADA.getPreco());
        System.out.println("6 => " + Lanche.Comida.HOTDOG.getNome() + " R$ " + Lanche.Comida.HOTDOG.getPreco());
        System.out.println("7 => " + Lanche.Comida.XBURGER.getNome() + " R$ " + Lanche.Comida.XBURGER.getPreco());
        System.out.println("8 => " + Lanche.Comida.KIKAO.getNome() + " R$ " + Lanche.Comida.KIKAO.getPreco());
        System.out.println("0 => Terminar Pedido");
        System.out.print("\nEscolha sua Opção: ");
    }

    public static double preco(int opcao) {
        switch (opcao) {
            case 1:
                return Lanche.Bebida.COCA_COLA.getPreco();
            case 2:
                return Lanche.Bebida.SPRITE.getPreco();
            case 3:
                return Lanche.Bebida.FANTA.getPreco();
            case 4:
                return Lanche.Bebida.AGUA.getPreco();
            case 5:
                return Lanche.Comida.XSALADA.getPreco();
            case 6:
                return Lanche.Comida.XBURGER.getPreco();
            case 7:
                return Lanche.Comida.HOTDOG.getPreco();
            case 8:
                return Lanche.Comida.KIKAO.getPreco();
            default:
                return 0f;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float total = 0f;
        int opcao;


        do {
            new Lanche();
            menu();
            opcao = sc.nextInt();
            total += preco(opcao);
            System.out.println("Valor Total R$ " + total + "\n");


        } while (opcao != 0);


    }


}
