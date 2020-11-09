package com.mateusborja.javafor;

public class ForExample06 {
    public static void main(String[] args) {

        int ctPar = 0, ctImpar = 0, i;
        int somaPares = 0;
        int somaImpares = 0;
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ctPar++;
                System.out.println("pares: " + i);
                somaPares += i;

            } else if (i % 2 != 0) {
                ctImpar++;
                System.out.println("impares: " + i);
                somaImpares += i;

            }
        }

        System.out.println("\nsoma dos pares: " + somaPares);
        System.out.println("qtd de pares: " + ctPar);

        System.out.println("\nsoma dos impares: " + somaImpares);
        System.out.println("qtd de impares: " + ctImpar);

    }

}
