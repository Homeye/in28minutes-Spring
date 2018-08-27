package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    public void sumWith3Numbers() {
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sumWith1Number() {
        assertEquals(3, myMath.sum(new int[]{3}));
    }
}