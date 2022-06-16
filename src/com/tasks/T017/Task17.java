package com.tasks.T017;

public class Task17 {

    public static void main(String[] args) {
        System.out.println("Ответ: " + decision(0, 10));
    }


    private static double function(double x){
        return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - (345.3 * x) - 23;
    }


    private static double decision(double startPosition, double endPosition){
        if(endPosition - startPosition <= 0.001){
            return startPosition;
        }

        double x = startPosition + (endPosition - startPosition) / 2;

        if  (function(startPosition) * function(x) > 0){
            return decision(x, endPosition);
        }
        else {
            return decision(startPosition, x);
        }
    }

}
