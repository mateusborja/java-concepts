/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex02;

import java.util.Scanner;

public class AplicacaoDiaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("dia de hoje: ");
        String dia = sc.nextLine();
        if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda-feira") ||
                dia.equalsIgnoreCase("1")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.SEGUNDA);

        } else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terça-feira") ||
                dia.equalsIgnoreCase("2")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.TERCA);

        } else if (dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quarta-feira") ||
                dia.equalsIgnoreCase("3")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.QUARTA);
        } else if (dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("quinta-feira") ||
                dia.equalsIgnoreCase("4")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.QUINTA);
        } else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira") ||
                dia.equalsIgnoreCase("5")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.SEXTA);
        } else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado") ||
                dia.equalsIgnoreCase("6")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.SABADO);
        } else if (dia.equalsIgnoreCase("domingo") || dia.equalsIgnoreCase("7")) {
            System.out.println("Hoje é ");
            imprimirDiaSemana(DiaSemanaEnum.DOMINGO);
        } else {
            System.out.println("Dia Inválido");
        }


    }

    private static void usandoEnum() {
        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;
        System.out.println("Utilizando enum");

        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);

    }


    private static void imprimirDiaSemana(DiaSemanaEnum dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Inválido");
        }


    }


}
