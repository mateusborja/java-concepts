/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex04;

public class Lanche {


    public enum Bebida {
        COCA_COLA("Coca-Cola", 5),
        FANTA("Fanta", 4.5f),
        SPRITE("Sprite", 4f),
        AGUA("Agua", 3f);


        private String nome;
        private float preco;

        Bebida(String nome, float preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public float getPreco() {
            return preco;
        }

    }


    public enum Comida {
        XSALADA("X-Salada", 5.5f),
        HOTDOG("Hot-Dog", 4.5f),
        XBURGER("X-Burger", 7.5f),
        KIKAO("Cachorro-Quente", 3.5f);

        private String nome;
        private float preco;

        Comida(String nome, float preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public float getPreco() {
            return preco;
        }
    }


}
