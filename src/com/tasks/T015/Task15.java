package com.tasks.T015;

public class Task15 {
    public static void main(String[] args) {
        int[] values = new int[] {1,2,3};
        int[] weights = new int[] {1,2,10};
        Task15 task15 = new Task15(values, weights);
        int randEl = (int) (Math.random() * ( task15.arraySumWeight.length - 1));



        System.out.println(task15.arraySumWeight[randEl]);
    }

    private int[] arraySumWeight;

    public Task15(int[] values, int[] weights) {
        int sum = 0;
        for (int weight: weights) {
            sum += weight;
        }
        arraySumWeight = new int[sum];
        int crt = 0;

        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                arraySumWeight[crt++] = values[i];
            }
        }
    }
}
