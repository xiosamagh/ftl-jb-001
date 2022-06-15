package com.tasks.T010;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random1 = new Random();
        int n = random1.nextInt(20);
        int[] array = new int[n];
        Random random2 = new Random();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = random2.nextInt(10);
            sum+= array[i];
        }

        Arrays.sort(array);
        System.out.println("Минимальное число = " + array[0]);
        System.out.println("Максимальное число = " + array[array.length-1]);
        System.out.println("Среднее значение = " + sum/n);

        System.out.println(Arrays.toString(array));

    }
}
