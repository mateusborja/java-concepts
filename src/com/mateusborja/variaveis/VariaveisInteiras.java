package com.mateusborja.variaveis;

public class VariaveisInteiras {

    public static void main(String[] args) {

        int x, y, sum, sub;
        y = 1;
        x = 6;
        y -= 1;

        System.out.println(x++);
        System.out.println("novo valor de x: "+ x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println("o valor de x é: " + x);
        System.out.println((++y)-(y++));

        boolean a, b;
        a = true;
        b = false;
        System.out.println(a);
        System.out.println(b);

        long l, n;
        l = 10l;
        n = 5l;
        System.out.println(l+n);

        short m= 4, o= 2;
        System.out.println((m + 2) * (o - 1));


    }
}
