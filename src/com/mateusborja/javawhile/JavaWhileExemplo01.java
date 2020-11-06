//java while
package com.mateusborja.javawhile;

public class JavaWhileExemplo01 {

    public static void main(String[] args) {

        int x = 0;

        while (x < 5) {
            System.out.println(x);
            x++;

        }
        System.out.println("\n");

        int y = 1;

        while (++y < 10) {
            System.out.println(y);
        }

        System.out.println("\n");

        int z = -1;
        while (z-- > -15) {
            System.out.println(z);
        }
        System.out.println("\n");

    }
}
