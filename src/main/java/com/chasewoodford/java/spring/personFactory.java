package com.chasewoodford.java.spring;

public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person.");
        return new Person(id, name);
    }
}
