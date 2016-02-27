package com.chasewoodford.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");

        FruitBasket fruitBasket = (FruitBasket)context.getBean("basket");

        System.out.println("\n" + fruitBasket);
    }

}
