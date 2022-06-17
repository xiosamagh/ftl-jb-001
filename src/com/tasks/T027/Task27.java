package com.tasks.T027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int max = 1000000;

        Task27.addEl(max, arrayList);
        Task27.addEl(max, linkedList);


        System.out.println(randomEl(max, arrayList));

        System.out.println(randomEl(max, linkedList));



    }

    static List<Integer> addEl(int N, List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }



    static Integer randomEl(int N, List<Integer> list) {
        Random random = new Random();
        int el = 0;
        for (int i = 0; i < N; i++) {
            el = list.get(random.nextInt(N));
        }

        return el;
    }
}
