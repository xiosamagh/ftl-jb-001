package com.company;

//import com.company.L001.HelloWorld;
//import com.company.L002.POJO;
//import com.company.L003.Cat;


import com.company.L013.SwitchExample;
import com.company.L019.StringExample;
import com.company.L020.TypeConversion;
import com.company.animals.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Animal.WeightException {
//        POJO.run();
//
//        Cat cat = new Cat();
//        cat.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsi", new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG));

        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();

        dog.voice();

        Dog homelessDog = Dog.ofHomeLess(new Animal.AnimalWeight(25, Animal.AnimalWeight.WeightType.KG));
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
                Dog.ofHomeLess(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeLess(new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeLess(new Animal.AnimalWeight(6, Animal.AnimalWeight.WeightType.KG))
        });

        for (Dog dogItem : dogHomeless) {
            System.out.println(dogItem);
            dogItem.setName(String.valueOf(new Random().nextLong()));
            System.out.println(dogItem.getName());
        }


        List<Dog> dogsLinkedList = new LinkedList<>();

        dogsLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
        dogsLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(31, Animal.AnimalWeight.WeightType.KG)));


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

        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
        try {
            dog.getWeight().setValue(-10);
        }
        catch (Animal.WeightException ignore) {
            
        }




    }
}
