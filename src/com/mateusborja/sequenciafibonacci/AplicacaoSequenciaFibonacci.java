package com.mateusborja.sequenciafibonacci;

public class AplicacaoSequenciaFibonacci {

    static long fibonacciNum;

    public static void main(String[] args) {

        //quinto numero da seria de fibonacci
        fibonacciNum = SequenciaFibonacci.fibonacci(5);
        System.out.println(fibonacciNum);

        //imprimindo uma serie de numeros da seq. Fibonacci

        //sequencia de fibonacci - 13 numeros;
        System.out.print("13 primeiros fibonacci = ");
        for (int i = 0; i < 13; i++) {
            System.out.print(SequenciaFibonacci.fibonacci(i) + " ");


        }


        System.out.println();
        for (int i = 0; i < 13; i++) {
            System.out.print("(" + i + "): " + SequenciaFibonacci.fibonacci(i) + "\t");
        }


    }
}
