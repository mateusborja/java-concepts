/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javaenum.ex06;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumero() {
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumero() {
            return GeraCpfCnpj.cnpj();
        }
    };


    public abstract String geraNumero();
}
