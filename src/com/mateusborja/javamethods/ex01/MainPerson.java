package com.mateusborja.javamethods.ex01;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        List<Address> address = new ArrayList<Address>();

        Person student1 = new Person();
        Student idstudent1 = new Student();
        Address addressstudent1 = new Address();

        Person student2 = new Person();
        Student idstudent2 = new Student();
        Address addressstudent2 = new Address();


        //student1 main attributes through object student1
        idstudent1.setIdNumber(293);
        student1.setName("Philip Baldruing");
        student1.setPhone(558080000);
        student1.setEmail("philip@bolgrind.com");
        persons.add(student1); //arraylist address;

        //student2 main attributes through object student2
        idstudent2.setIdNumber(103);
        student2.setName("Joaquim Baldruing");
        student2.setPhone(338080000);
        student2.setEmail("joaquim@bolgrind.com");
        persons.add(student2);

        //student1 address1 attributes through object addressstudent1
        addressstudent1.setStreet("R.Fourlad Street, N.09");
        addressstudent1.setCity("Salt Lake City");
        addressstudent1.setState("UTA");
        addressstudent1.setPostalCode(1003022);
        addressstudent1.setCountry("USA");
        address.add(addressstudent1); //arraylist address;

        //student1 address2 attributes through object addressstudent1
        addressstudent1.setStreet("Avenue Maryland Street, N.1509");
        addressstudent1.setCity("New York");
        addressstudent1.setState("NY");
        addressstudent1.setPostalCode(101022);
        addressstudent1.setCountry("USA");
        address.add(addressstudent1); //arraylist address;

        //student2 address1 attributes  through object addressstudent2
        addressstudent2.setStreet("R.Fivelouard Street, N.19");
        addressstudent2.setCity("Salt Lake City");
        addressstudent2.setState("UTA");
        addressstudent2.setPostalCode(1003022);
        addressstudent2.setCountry("USA");
        address.add(addressstudent2); //arraylist address;

        System.out.println();
        System.out.println("Person 1");
        System.out.println(idstudent1.toString());
        System.out.println(student1.toString());
        System.out.println(addressstudent1.toString());
        System.out.println();

        System.out.println("Person 2");
        System.out.println(idstudent2.toString());
        System.out.println(student2.toString());
        System.out.println(addressstudent2.toString());
        System.out.println();

        //iteracao e impressao
        for (int i = 0; i < address.size(); i++) {
            System.out.println(address.get(i));
        }

        //System.out.println(address);


    }
}
