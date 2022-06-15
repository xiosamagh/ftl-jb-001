package com.tasks.T009;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        int i = 3;
        while (i > 0) {

            Scanner scanner = new Scanner(System.in);
            String option1 = scanner.nextLine();
            String answer = "Троллейбус";
            String option2 = "Сдаюсь";

            if (option1.equals(answer)) {
                System.out.println("Правильно!");
                return;
            }
            else if (option1.equals(option2)) {
                System.out.println("Правильный ответ: троллейбус");
                return;
            }
            else {
                if (i == 1) {
                    System.out.println("Ты проиграл! Правильный ответ: троллейбус");
                    return;
                }
                System.out.println("Подумай еще!");
                i--;
            }
        }

    }
}
