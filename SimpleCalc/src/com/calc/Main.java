package com.calc;

public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();

        calc.adding(20.0, 12.0);
        calc.dividing(20.0, 12.0);
        calc.subtraction(20.0, 12.0);
        calc.multiplication(20.0, 12.0);
        System.out.println("----------");
        calc.lastResult();

    }
}