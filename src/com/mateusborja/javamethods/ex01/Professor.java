/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javamethods.ex01;

public class Professor extends Person {

    double salary;

    public Professor() {

    }

    public Professor(double salary) {
        this.salary = salary;
    }

    public Professor(String name, int phone, String email, double salary) {
        super(name, phone, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
