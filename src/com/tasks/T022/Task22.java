package com.tasks.T022;

public class Task22 {
    public static void main(String[] args) {
        double temp = 100;
        BaseConverter baseConverter = new BaseConverter();
        System.out.println(baseConverter.getCelsiusConverterValue(temp));
        System.out.println(baseConverter.getKelvinConverterValue(temp));
        System.out.println(baseConverter.getFahrenheitConverterValue(temp));
    }
}
