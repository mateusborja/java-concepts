package com.mateusborja.sequenciafibonacci;

public class SequenciaFibonacci {

    public static long fibonacci(long num) {

        if (num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
