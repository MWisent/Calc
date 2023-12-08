package com.calc;

public class Calc {

    public static double result;

    private Calc() {}


    public static double adding(double x, double y) {
        result = x + y;
        return result;
    }
    public static double subtraction(double x, double y) {
        result = x - y;
        return result;
    }
    public static double dividing(double x, double y) {
        result = x / y;
        return result;

    }
    public static double multiplication(double x, double y) {
        result = x * y;
        return result;
    }

    public static double lastResult() {
        return result;
    }

}
