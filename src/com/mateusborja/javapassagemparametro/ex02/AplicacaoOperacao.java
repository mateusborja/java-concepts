/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javapassagemparametro.ex02;

public class AplicacaoOperacao {

    public static void main(String[] args) {
        Operacao o = new Operacao();
        int x = 10;

        o.trocar(x);
        System.out.println(x);

        Valor v1 = new Valor();
        v1.v = 15;

        o.alterarValor(v1);
        System.out.println(v1.v);

        Valor v2 = new Valor();
        v2.v = 10;

        o.alteraValorNovo(v2);
        System.out.println(v2.v);

    }
}


/*
conteudo copiado e atribuido ao parametro do metodo trocar
variavel armazena uma referencia, variavel do tipo de uma classe
passagem por referencia no java n existe  - area de memoria como parametro
copia por referencia e n passagem por referencia
duas variaveis apontando para o mesmo obt

 */