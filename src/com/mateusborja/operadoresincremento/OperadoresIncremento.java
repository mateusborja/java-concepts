package com.mateusborja.operadoresincremento;

public class OperadoresIncremento {
    public static void main(String[] args) {

        int num = 10, result = 0;

        System.out.println("Valor do result sem incremento: " + result);

        result = num++; // primeiro ele atribui, depois incrementa - pos-fixo
        System.out.println("Valor de num apos o incremento: " + num);
        System.out.println("Valor de result apos o incremento: " + result + "\n");

        num = 10; result = 0;
        result = ++num; //primeito ele incrementa depois atribui - pre-fixo
        System.out.println("Valor de num apos o incremento: " + num);
        System.out.println("Valor de result apos o incremento: " + result + "\n");

        int x = 10, y = 0;
        y = ++x; // pre-fixo;
        System.out.println("valor de x apos o incremento: " + x);
        System.out.println("valor de y apos o incremento: " + y + "\n");

        x = 10; y= 0;
        y = x++; //pos-fixo
        System.out.println("valor de x apos o incremento: " + x);
        System.out.println("valor de y apos o incremento: " + y + "\n");
        System.out.println("O Valor da diferanca entra x e y é: " + (x - y));



    }
}
