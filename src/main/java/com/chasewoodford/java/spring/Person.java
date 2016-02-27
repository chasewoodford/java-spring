package com.chasewoodford.java.spring;

public class Person {

    private int id;
    private String name;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Person getInstance(int id, String name) {
        System.out.println("Creating person like a boss.");
        return new Person(id, name);
    }

    public void  onCreate() {
        System.out.println("Person created: " + this);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
