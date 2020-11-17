/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.funcaohash;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TabelaComHashExemplo01 {

    private static int getRandomNumberIntRange() {
        int min = 1, max = 100000;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;


    }

    public static void main(String[] args) {

        Integer m = 10001;
        Map<Integer, Integer> mapa = new HashMap();
        Integer colisoes = 0, resto = 0;

        try {
            for (int i = 0; i < 7000; i++) {
                Integer randomico = getRandomNumberIntRange();
                resto = m % randomico;
                if (mapa.get(randomico) != null) {
                    colisoes++;
                }
                mapa.put(randomico, resto);

            }
            System.out.println("Qtd de colisoes: " + colisoes);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
