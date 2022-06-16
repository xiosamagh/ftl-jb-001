package com.tasks.T018;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }


}
