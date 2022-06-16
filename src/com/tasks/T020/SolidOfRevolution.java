package com.tasks.T020;



public  class SolidOfRevolution implements Shape {
    private double radius;
    private double volume;

    public SolidOfRevolution(double volume,double radius) {
        this.radius = radius;
        this.volume = volume;
    }

    public double getRadius() {
        return radius;
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
