package com.company;

//import com.company.L001.HelloWorld;
//import com.company.L002.POJO;
//import com.company.L003.Cat;


import com.company.L013.SwitchExample;
import com.company.L019.StringExample;
import com.company.L020.TypeConversion;
import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;
import com.company.animals.MoveType;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        List<Dog> dogHomeless = Arrays.asList( new Dog[] {
                Dog.ofHomeLess(2),
                Dog.ofHomeLess(4),
                Dog.ofHomeLess(5)
        });

        for (Dog dogItem : dogHomeless) {
            System.out.println(dogItem);
            dogItem.setName(String.valueOf(new Random().nextLong()));
            System.out.println(dogItem.getName());
        }


        List<Dog> dogsLinkedList = new LinkedList<>();

        dogsLinkedList.add(Dog.ofHomeLess(51));
        dogsLinkedList.add(Dog.ofHomeLess(51));
        dogsLinkedList.add(Dog.ofHomeLess(15));
        dogsLinkedList.add(Dog.ofHomeLess(51));
        dogsLinkedList.add(Dog.ofHomeLess(51));


        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()) {
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }
        for (int i =0; i < 100; i++) {
//            SwitchExample.run();
        }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK) {
            System.out.println("МОжет ходить");
        }

        StringExample.run();

        TypeConversion.run();


    }
}
