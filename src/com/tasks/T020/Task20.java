package com.tasks.T020;



public class Task20 {
    public static void main(String[] args) {
        Shape cylinder = new Cylinder(20, 2.5,3);
        Shape ball = new Ball(15, 3.3);
        Shape pyramid = new Pyramid(9,9, 3);
        Shape pyramid2 = new Pyramid(9,3, 9);
        Shape ball2 = new Ball(6, 2.3);
        Box box = new Box(50);



        System.out.println("В контейнере свободно: " + box.getVolume());
        box.add(cylinder);
        System.out.println("В контейнере свободно: " + box.getVolume());
        box.add(ball);
        System.out.println("В контейнере свободно: " + box.getVolume());
        box.add(pyramid);
        System.out.println("В контейнере свободно: " + box.getVolume());
        box.add(pyramid2);
        System.out.println("В контейнере свободно: " + box.getVolume());
        box.add(ball2);
        System.out.println("В контейнере свободно: " + box.getVolume());
    }
}
