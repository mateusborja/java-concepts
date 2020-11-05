//java for example
package com.mateusborja.javafor;

public class ForExample05 {

    public static void main(String[] args) {

        int a = 2;
        for (; ; a += a) {
            if (a > 5) {
                break;
            }
        }

        System.out.println(a);


    }
}
