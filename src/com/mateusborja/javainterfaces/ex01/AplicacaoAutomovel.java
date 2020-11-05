package com.mateusborja.javainterfaces.ex01;

import java.text.DecimalFormat;

public class AplicacaoAutomovel {

    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat();

        Ferrari f = new Ferrari();
        Lamborguini l = new Lamborguini();
        AnelBrilhante anel1 = new AnelBrilhante();
        Rota rota = new Rota();
        Vendedor v = new Vendedor();

        f.setMarca("Marca: Ferrari");
        System.out.println(f.getMarca());
        f.setModelo("Modelo: M970");
        System.out.println(f.getModelo());
        System.out.println("Valor da Ferrari é R$ " + dc.format(f.getPreco()));
        v.mostrarPreco(f);

        System.out.println();
        l.setMarca("Marca: Lamborguini");
        System.out.println(l.getMarca());
        l.setModelo("Modelo: AXUS 920");
        System.out.println(l.getModelo());
        System.out.println("Valor da Lamborguini é R$ " + dc.format(l.getPreco()));
        v.mostrarPreco(l);

        System.out.println();
        rota.ir(f);

        System.out.println();
        rota.ir(l);

        System.out.println();
        System.out.printf("Valor do Anel é R$ %s%n", dc.format(anel1.getPreco()));
        v.mostrarPreco(anel1);

        System.out.println();
        Bicicleta b = new Bicicleta();
        System.out.println("Valor da Bicicleta é R$ " + dc.format(b.getPreco()));
        v.mostrarPreco(b);

    }

}
