package com.mateusborja.casting;

public class CastingInplicitoExplicito {

    public static void main(String[] args) {

        int x = 10, y = 15, z = 30, op1;
        double a = 10.0, b = 15.0, c = 30.0, op2;

        //casting explicit
        op2 = (int) x + y;
        System.out.println(op2);

        //casting explicit
        op1 = (int) (z / y);
        System.out.println(op1);

        //casting implicit
        op2 = z / b;
        System.out.println(op2);

        long m = 10;
        int w = (int) m;
        System.out.println(w);

        //casting implicit
        long t = 93000000035L;
        double q;
        q = t;
        System.out.println(q);

        //casting explicit
        long e = 93000000035L;
        int f = (int) t;
        System.out.println(f);

        //casting implicit
        int g = 102344;
        long h = g;
        System.out.println(h);

        //casting explicit
        double i = 20.5;
        float j = (float) i;
        System.out.println(j);

        //casting implicit
        float k = 1040F;
        double r = k;
        System.out.println(r);


    }
}
