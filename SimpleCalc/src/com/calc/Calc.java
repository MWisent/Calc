package com.calc;

public class Calc {

    private double result;



    public void adding(double x, double y) {
        this.result = x + y;
        System.out.println("Wynik dodawania: " + this.result);
    }
    public void subtraction(double x, double y) {
        this.result = x - y;
        System.out.println("Wynik odejmowania: " + this.result);
    }
    public void dividing(double x, double y) {
        this.result = x / y;
        System.out.println("Wynik dzielenia: " + this.result);
    }
    public void multiplication(double x, double y) {
        this.result = x * y;
        System.out.println("Wynik mnożenia: " + this.result);
    }

    public void lastResult() {
        System.out.println("Ostatnia wartość: " + this.result);
    }


}
