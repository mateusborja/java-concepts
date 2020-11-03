package com.mateusborja.forexample01;

public class ForExample02 {

    public static void main(String[] args) {

        int x = 0;

        for (int i = 0; i < 8; i++) {

            if(i % 2 == 0) {

                System.out.println("O numero " + i + " é divisivel por 2.");
            } else {

                if(i % 3 == 0) {

                    System.out.println("O numero " + i + " é divisivel por 3.");

                }

                if (i % 4 == 0) {

                    System.out.println("O numero " + i + " é divisivel por 4.");

                }
            }
        }

    }

}
