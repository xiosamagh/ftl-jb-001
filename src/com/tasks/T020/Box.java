package com.tasks.T020;

public class Box implements Shape {

    private double volume;


    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (this.getVolume() >= shape.getVolume()) {
            this.setVolume(this.getVolume() - shape.getVolume());
            return true;

        }
        else if (shape.getVolume() > this.getVolume()){
            System.out.println("Для этой фигуры места не хватит! " + shape);
            return false;
        }
        else {
            System.out.println("Место кончилось!");
            return false;
        }
    }


    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }
}
