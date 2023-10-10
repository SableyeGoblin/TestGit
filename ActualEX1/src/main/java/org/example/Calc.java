package org.example;

public class Calc {
    public double add(double x, double y){
        return x + y;
    }

    public double sub(double x, double y){
        return x - y;
    }

    public double mult(double x, double y){
        return x * y;
    }

    public double divi(double x, double y){
        if (y == 0) {
            throw new IllegalArgumentException("Don't break the universe");
        }
        return x / y;
    }
}