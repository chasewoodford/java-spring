package com.chasewoodford.java.spring;

import java.util.List;

public class Pets {
    private Pet largest;
    private List<Pet> pets;

    public void setLargest(Pet largest) {
        this.largest = largest;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Largest: " + largest);
        sb.append("\n");
        sb.append("Others:\n");

        for(Pet pet: pets) {
            sb.append(pet);
            sb.append("\n");
        }

        return sb.toString();
    }
}
