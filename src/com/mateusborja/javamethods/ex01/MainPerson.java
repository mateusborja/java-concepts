package com.mateusborja.javamethods.ex01;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        List<Address> address = new ArrayList<Address>();

        Person student1 = new Person();
        Student idstudent1 = new Student();

        Person student2 = new Person();
        Student idstudent2 = new Student();


        //student1
        idstudent1.setIdNumber(293);
        student1.setName("Philip Baldruing");
        student1.setPhone(558080000);
        student1.setEmail("philip@bolgrind.com");
        persons.add(student1); //arraylist addressList;

        Address addressList = new Address();

        //student2
        idstudent2.setIdNumber(103);
        student2.setName("Joaquim Baldruing");
        student2.setPhone(338080000);
        student2.setEmail("joaquim@bolgrind.com");
        persons.add(student2);

        addressList = new Address();

        //student1 addressList attributes through object addressList
        addressList.setStreet("R.Fourlad Street, N.09");
        addressList.setCity("Salt Lake City");
        addressList.setState("UTA");
        addressList.setPostalCode(1003022);
        addressList.setCountry("USA");

        address.add(addressList); //arraylist addressList;

        addressList = new Address();

        //student1 address2
        addressList.setStreet("Avenue Maryland Street, N.1509");
        addressList.setCity("New York");
        addressList.setState("NY");
        addressList.setPostalCode(101022);
        addressList.setCountry("USA");
        address.add(addressList); //arraylist addressList;


        //student2 addressList
        addressList = new Address();
        addressList.setStreet("R.Fivelouard Street, N.19");
        addressList.setCity("Salt Lake City");
        addressList.setState("UTA");
        addressList.setPostalCode(1003022);
        addressList.setCountry("USA");
        address.add(addressList); //arraylist addressList;

        System.out.println();
        System.out.println("Person 1");
        System.out.println(idstudent1.toString());
        System.out.println(student1.toString());
        System.out.println(addressList.toString());
        System.out.println();

        System.out.println("Person 2");
        System.out.println(idstudent2.toString());
        System.out.println(student2.toString());
        System.out.println(addressList.toString());
        System.out.println();

        //iteracao e impressao
        for (int i = 0; i < address.size(); i++) {
           System.out.println(address.get(i));
       }




    }
}
