/*
 * Copyright (c) 2020.  | All rights reserved
 * Mateus Borja // UX Designer • 3D Artist • Developer
 * www.mateusborja.life
 */

package com.mateusborja.javamethods.ex01;

public class Student extends Person {

    private int idNumber;

    public Student() {

    }

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    public Student(String name, int phone, String email, int idNumber) {
        super(name, phone, email);
        this.idNumber = idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        //super.toString();
        return "Student iD = " + this.idNumber;
    }
}
