package com.tasks.T008;



public class Task8 {
    public static void main(String[] args) {
        Task8.fibonachi();
    }
    static void fibonachi() {
        int num = 11;
        int oneNumber = 1;
        int twoNumber = 1;
        System.out.print(oneNumber + " " + twoNumber);
        int fib = 2, i = 2;
        while (i < num) {
            fib = oneNumber + twoNumber;
            oneNumber = twoNumber;
            twoNumber = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}
