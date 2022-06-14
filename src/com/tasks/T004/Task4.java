package com.tasks.T004;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(sum(N));
    }

    static int sum(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            result+=i;
        }
        return result;
    }
}
