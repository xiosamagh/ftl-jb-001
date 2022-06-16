package com.tasks.T018;

public class Box extends Shape{


    public Box(double volume) {
        super(volume);
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
}
