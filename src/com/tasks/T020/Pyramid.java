package com.tasks.T020;

public class Pyramid implements Shape {
    private double s;
    private double h;
    private double volume;

    public Pyramid(double volume, double s, double h) {
        this.volume = volume;
        this.s = s;
        this.h = h;

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
