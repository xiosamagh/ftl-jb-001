package com.tasks.T012;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= 100; i ++){
            boolean isSimple = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isSimple = false;
                    break;
                }
            }

            if(isSimple){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
