package com.tasks.T006;

public class Task6 {
    public static void main(String[] args) {
        Task6.power();
    }

    static void power() {
        for (int i = 0; i < 10; i++) {
            int two = (int) Math.pow(2, i);
            System.out.print(two + " ");
        }
    }
}
