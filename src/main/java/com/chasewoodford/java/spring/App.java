package com.chasewoodford.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
        person.speak();

        Address address = (Address)context.getBean("address");
        System.out.println(address);

        System.out.println(person);
    }

}
