package com.tasks.T026;

import java.util.*;

public class Task26 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,1,2,1,2,45,56,45);

        System.out.println(Task26.deleteDuplicates(list));
    }

    public static <T> Collection<T> deleteDuplicates(Collection<T> collection) {
        return new TreeSet<>(collection);
    }
}
