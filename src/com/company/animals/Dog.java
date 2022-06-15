package com.company.animals;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {}

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
}
