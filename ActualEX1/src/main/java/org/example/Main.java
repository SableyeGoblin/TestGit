package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Maven");
        Calc math = new Calc();

        System.out.println(math.add(5, 5));
        System.out.println(math.sub(5, 5));
        System.out.println(math.mult(5, 5));
        System.out.println(math.divi(5, 5));
    }
}