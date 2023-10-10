package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalcTest {

    Calc math = new Calc();

    @Test
    void add() {
        assertEquals(10, math.add(5, 5));
        assertNotEquals(8, math.add(7, 0));
    }

    @Test
    void sub() {
        assertEquals(math.sub(5, 5), 0);
        assertNotEquals(1, math.sub(5, 6));
    }

    @Test
    void mult() {
        assertEquals(math.mult(5, 5), 25);
        assertNotEquals(7, math.mult(7, 0));
    }

    @Test
    void divi() {
        assertEquals(math.divi(5, 5), 1);
        assertNotEquals(1, math.divi(7, 5));
    }
}