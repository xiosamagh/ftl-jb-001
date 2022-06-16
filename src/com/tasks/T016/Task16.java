package com.tasks.T016;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Random random = new Random();
        int N = random.nextInt(100000000);
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            Random random1 = new Random();
            array[i] = random1.nextInt(1000);
        }

//        int[] array = new int[] {1,2,3,4,5,6,7,8,9,1};
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();




        if (searchElement(array,num) != -1) {
            System.out.println("Элемент найден на позиции: " + searchElement(array,num));
        }
        else {
            System.out.println("Элемент не найден!");
        }
    }

    public static int searchElement(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return i;


        }

        return -1;



    }


}
