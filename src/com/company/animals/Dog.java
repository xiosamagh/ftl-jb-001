package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
        super();

    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("sharik", 4));
        dogs.add(Dog.of("buble", 1));
        dogs.add(Dog.of("tyzik", 6));



        return dogs;
    }

    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog() {
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, Integer weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeLess(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("гав гав!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
