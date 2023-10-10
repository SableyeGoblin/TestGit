package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Maven");
        Calc math = new Calc();

        System.out.println(math.add(5, 10));
        System.out.println(math.sub(10, 5));
        System.out.println(math.mult(4, 4));
        System.out.println(math.divi(10, 5));
    }
}
