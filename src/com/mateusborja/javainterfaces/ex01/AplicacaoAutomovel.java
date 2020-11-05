package com.mateusborja.javainterfaces.ex01;

public class AplicacaoAutomovel {

    public static void main(String[] args) {

        Ferrari f = new Ferrari();
        Lamborguini l = new Lamborguini();

        Rota rota = new Rota();
        Vendedor vendedor = new Vendedor();

        f.setMarca("Marca: Ferrari");
        System.out.println(f.getMarca());
        f.setModelo("Modelo: M970\n");
        System.out.println(f.getModelo());

        l.setMarca("Marca: Lamborguini");
        System.out.println(l.getMarca());
        l.setModelo("Modelo: AXUS 920\n");
        System.out.println(l.getModelo());

        rota.ir(f);
        System.out.println();
        rota.ir(l);


    }

}
