package com.tasks.T025;

import java.util.Arrays;
import java.util.function.Function;

public class Task25 {
    public static void main(String[] args) {
        String[] array =
                new String[]{"fkfkqw",null, "ope", "dog", "13141"};

        String[] array1 = filter(array, s -> s != "ope");

        System.out.println(Arrays.toString(array1));

        Integer[] arrayInt = new Integer[] {0,1,2,3,-1,26,156,821,-892,121};

        Integer[] arrayInt1 = filter(arrayInt, s1 -> s1 > 25);

        System.out.println(Arrays.toString(arrayInt1));

    }

    public static <T> T[] filter(T[] array, Function<? super T, Boolean> filter) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                count++;
            } else {
                array[i - count] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - count);
    }
}
