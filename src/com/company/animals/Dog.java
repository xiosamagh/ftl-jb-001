package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);

    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();
        try {
            dogs.add(Dog.of("sharik", new AnimalWeight(-1, AnimalWeight.WeightType.KG)));
            dogs.add(Dog.of("buble", new AnimalWeight(1, AnimalWeight.WeightType.KG)));
            dogs.add(Dog.of("tyzik", new AnimalWeight(5, AnimalWeight.WeightType.KG)));
        }
        catch (WeightException w) {
            w.printStackTrace();
        }




        return dogs;
    }

    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog() {
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeLess(AnimalWeight weight) {
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
