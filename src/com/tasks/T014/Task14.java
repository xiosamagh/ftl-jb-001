package com.tasks.T014;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2,2, 4);
        Vector vector2 = new Vector(3, 2, 2);

        System.out.println("Длина вектора 1 = " + vector1.lengthVector());
        System.out.println("Длина вектора 2 = " + vector2.lengthVector());

        System.out.println("Скалярное произведение двух векторов: " + Vector.scalar(vector1, vector2));
        System.out.println("Векторное произведение векторов: " + Vector.vectorComposition(vector1, vector2));
        System.out.println("Угол между векторами: " + Vector.angle(vector1, vector2));
        System.out.println("Сумма векторов: " + Vector.sum(vector1,vector2));
        System.out.println("Разность векторов: " + Vector.difference(vector1, vector2));

        System.out.println("Массив векторов: " + Arrays.toString(Vector.arrayVector(4)));



    }
}
