//numero divisivel
package com.mateusborja.forexample01;

public class ForExample01 {

    public static void main(String[] args) {


        for (int i = 0; i < 12; i++) {
            if (i % 6 == 0)
                System.out.println("O número " + i + " é Divisivel por 2 e 3");
            else {
                if (i % 2 == 0)
                    System.out.println("O número " + i + " é Divisivel por 2");
                if (i % 3 == 0)
                    System.out.println("O número " + i + " é Divisivel por 3");
            }

        }

    }

}
