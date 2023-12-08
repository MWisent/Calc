package com.calc;

public class Main {
    public static void main(String[] args) {

        double result = Calc.adding(23, 3);

        System.out.println("Wynik dodawania: " + result);

        result = Calc.dividing(22, 2);

        System.out.println("Wynik dzielenia: " + result);

        result = Calc.lastResult();
        System.out.println("Ostatni wynik " + result);

//        Calc calc = new Calc();
//
//        calc.adding(20.0, 12.0);
//        calc.dividing(20.0, 12.0);
//        calc.subtraction(20.0, 12.0);
//        calc.multiplication(20.0, 12.0);
//        System.out.println("----------");
//        calc.lastResult();

    }
}