package com.chasewoodford.java.spring;

import sun.nio.ch.sctp.PeerAddrChange;

public class Person {

    private int id;
    private String name;
    private int taxId;
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

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
