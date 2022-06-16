package com.tasks.T018;

public abstract class Shape {
    private double volume;

    public double getVolume() {
        return volume;
    }

    public Shape(double volume) {
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                '}';
    }
}
