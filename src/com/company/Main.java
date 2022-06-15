package com.company;

//import com.company.L001.HelloWorld;
//import com.company.L002.POJO;
//import com.company.L003.Cat;


import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

public class Main {

    public static void main(String[] args) {
//        POJO.run();
//
//        Cat cat = new Cat();
//        cat.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsi", 20);

        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();

        dog.voice();

        Dog homelessDog = Dog.ofHomeLess(100);
        homelessDog.voice();

        Duck duck = new Duck();

        duck.voice();
        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();
        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();

    }
}
