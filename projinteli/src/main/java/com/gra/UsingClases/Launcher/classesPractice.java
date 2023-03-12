package com.gra.UsingClases.Launcher;

import com.gra.UsingClases.Model.Person;

public class classesPractice {
    public static void main(String[] args)
    {
       Person person = new Person() ;
        person.setFirstName("Kelly");
        person.setMiddleName("Xiomara");
        person.setLastName("Amaya");
        System.out.println(person);
        System.out.println("------------------------");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println("------------------------");
        System.out.println(person.getFirstName()+" "+person.getLastName());
    }
}
