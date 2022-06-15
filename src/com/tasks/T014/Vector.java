package com.tasks.T014;

import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthVector() {  // длина вектора
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double scalar(Vector v1, Vector v2) { // скалярное произведение
        return v1.x *v2.x + v1.y *v2.y + v1.z * v2.z;
    }

    public static double angle(Vector v1, Vector v2) // угол между векторами
    {
        return Math.cos((v1.x * v2.x + v1.y * v2.y + v1.z * v2.z) / ((Math.sqrt((v1.x * v1.x + v1.y * v1.y + v1.z * v1.z))) * (Math.sqrt((v2.x * v2.x + v2.y * v2.y + v2.z * v2.z)))));
    }

    public static Vector vectorComposition(Vector v1, Vector v2) { // векторное произведение
        double tmpX = v1.y * v2.z - v1.z * v2.y;
        double tmpY = -(v1.x * v2.z - v1.z * v2.x);
        double tmpZ = v1.z * v2.y - v1.y * v2.x;
        return new Vector(tmpX, tmpY, tmpZ);
    }

    public static Vector sum(Vector v1, Vector v2) { // сумма
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector difference(Vector v1, Vector v2) { // разность
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector[] arrayVector(int n) { // массив случайных векторов
        Vector[] vectors = new Vector[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(random.nextInt(10),random.nextInt(10),random.nextInt(10));
        }
        return vectors;
    }


    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
