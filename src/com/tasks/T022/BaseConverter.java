package com.tasks.T022;

public class BaseConverter {
    public double getCelsiusConverterValue(double value) {
        return value;
    }
    public double getKelvinConverterValue(double value) {
        return value + 273;
    }
    public double getFahrenheitConverterValue(double value) {
        return 1.8 * value + 32;
    }
}
