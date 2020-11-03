//numeros primos e multipos
package com.mateusborja.forexample01;

public class ForExampleNumerosPrimos01 {

    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " é par");
                if (n == 2)
                    System.out.print(" e primo");
                else if (n % 4 == 0)
                    System.out.print(" e múltiplo de 4");
            } else {
                System.out.print(n + " é ímpar");

                boolean primo = true;
                if (n > 2) {
                    for (int i = 3; i < n / 2; i += 2) {
                        if (n % i == 0) {
                            primo = false;
                            break;
                        }
                    }

                    if (primo)
                        System.out.print(" e primo");
                }
            }
            if (n % 3 == 0)
                System.out.print(" e múltiplo de 3");
            if (n % 5 == 0) {
                System.out.print(" e múltiplo de 5. Múltiplos menores que " + n + ":");

                for (int mult = n - 5; mult >= 0; mult -= 5)
                    System.out.print(" " + mult);
            }

            System.out.println();
        }

    }

}
