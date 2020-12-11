/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex03;

import com.mateusborja.javaenum.ex03.Formulario.Genero;
import java.util.ArrayList;

public class AplicacaoFormulario {

    public static void main(String[] args) {

    ArrayList<Formulario> listaFormularios = new ArrayList<Formulario>();

        Formulario f1 = new Formulario("Joao Honorio", Genero.MASCULINO);
        Formulario f2 = new Formulario("Leda Honorio", Genero.FEMININO);
        Formulario f3 = new Formulario("Jose Honorio", Genero.MASCULINO);

        listaFormularios.add(f1);
        listaFormularios.add(f2);
        listaFormularios.add(f3);

        System.out.println(listaFormularios);
    }




}
