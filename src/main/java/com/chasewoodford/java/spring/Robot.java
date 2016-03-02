package com.chasewoodford.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

    private int id = 0;
    private String speech = null;

    public void speak() {

        if (speech != null) {
            System.out.println("\n" + id + ": " + speech);
        } else {
            System.out.println("\nWomp. Bad robot.");
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("Danger Will Robinson!") String speech) {
        this.speech = speech;
    }
}
