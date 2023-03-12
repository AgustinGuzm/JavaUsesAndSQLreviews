package com.gra.UsingClases.Model;

import java.util.Objects;

public class Person {
    String firstName;
    String MiddleName;
    String LastName;


    public Person() {
    }


    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(MiddleName, person.MiddleName) && Objects.equals(LastName, person.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, MiddleName, LastName);
    }

    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
