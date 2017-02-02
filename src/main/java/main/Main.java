package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

        Car alfaRomeo = (Car) applicationContext.getBean("alfaRomeo");
        Car ford = (Car) applicationContext.getBean("ford");
        Car shkoda = (Car) applicationContext.getBean("shkoda");
        Car bmw = (Car) applicationContext.getBean("bmw");
        Car audi = (Car) applicationContext.getBean("audi");

        System.out.println(alfaRomeo);
        System.out.println(ford);
        System.out.println(shkoda);
        System.out.println(bmw);
        System.out.println(audi);

    }
}
