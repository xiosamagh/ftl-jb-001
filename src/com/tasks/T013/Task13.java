package com.tasks.T013;

import java.util.*;

public class Task13 {
    public static void main(String[] args) {

        Integer[] array = new Integer[] {1,5,5,2,3,4,5,3,1,3,3,10,5,1,10,12,12,16,7,7,2,2,3};
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число, которое хотите удалить: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(n, list.get(i))) {
                list.remove(i);
                i--;
            }
        }

        array = list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(array));
    }
}
