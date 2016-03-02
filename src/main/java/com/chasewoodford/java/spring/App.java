package com.chasewoodford.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");

        FruitBasket fruitBasket = (FruitBasket)context.getBean("basket");

        Pets pets = (Pets)context.getBean("pets");

        Jungle jungle = (Jungle)context.getBean("jungle");

        System.out.println("\n" + person);
        System.out.println("\n" + fruitBasket);
        System.out.println("\n" + pets);
        System.out.println("\n" + jungle);

        Logger logger = (Logger)context.getBean("logger");

        logger.writeConsole("Hello world!");
        logger.writeFile("Hi again");

        Robot robot = (Robot)context.getBean("robot");
        robot.speak();

    }

}
