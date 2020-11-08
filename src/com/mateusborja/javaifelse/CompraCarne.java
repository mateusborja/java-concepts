package com.mateusborja.javaifelse;

import java.util.Locale;
import java.util.Scanner;

public class CompraCarne {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde de carne: ");
        double qtdComprada = sc.nextDouble();

        System.out.printf("tipo da carne (1 - File / 2 - Alcatara / 3 - Picanha): ");
        int tipoCarne = sc.nextInt();

        double precoKg = 0;
        if (tipoCarne == 1) {
            if (qtdComprada <= 5) {
                precoKg = 5.0;
            } else {
                precoKg = 8.0;
            }

        } else if (tipoCarne == 2) {
            if (qtdComprada <= 5) {
                precoKg = 4.0;
            } else {
                precoKg = 5.0;

            }
        } else if (tipoCarne == 3) {
            if (qtdComprada <= 5) {
                precoKg = 8.0;
            } else {
                precoKg = 10.0;

            }
        }

        double desconto;
        double total = qtdComprada * precoKg;

        System.out.print("Compra no Cartao: 1 - Sim / 2 - Não? ");
        int compraCartao = sc.nextInt();

        if (compraCartao == 1) {
            desconto = (total / 100) * 7.0;
            total -= desconto;
            System.out.println("Valor a pagar: R$ " + total);
        } else if (compraCartao == 2) {
            total = qtdComprada * precoKg;
            System.out.println("Valor a pagar: R$ " + total);
        }


        sc.close();
    }
}
