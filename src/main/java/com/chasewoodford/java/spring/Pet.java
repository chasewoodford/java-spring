package com.chasewoodford.java.spring;

public class Pet {

    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", type=" + type + "]";
    }
}
