package com.mateusborja.javarecursividade;

public class FatorialRecursivo {

    public static int fatorialRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorialRecursivo(num - 1);
    }


    static int fatorialR;

    public static void main(String[] args) {

        fatorialR = FatorialRecursivo.fatorialRecursivo(5);
        System.out.println("Fatorial de 5 é =  " + fatorialR);


    }

}
