package com.chasewoodford.java.spring;

import java.util.HashMap;
import java.util.Map;

public class Jungle {

    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Pet> pets = new HashMap<String, Pet>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public void setPets(Map<String, Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Foreal jungle animalz and what they eat:\n");

        for(Map.Entry<String, String> entry: foods.entrySet()) {
            sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
        }

        sb.append("\n");
        sb.append("Jungle pets yo!\n");

        for(Map.Entry<String, Pet> entry: pets.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        return sb.toString();

    }
}
