package com.tasks.T011;

import java.util.Arrays;
import java.util.Random;

public class Task11 {

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i< n; i++) {
            array[i] = random.nextInt(25);
        }

        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int num;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    num = array[i];
                    array[i] = array[i+1];
                    array[i+1] = num;
                }
            }
        }

        System.out.println("Отсортированный: ");
        System.out.println(Arrays.toString(array));



    }


}
