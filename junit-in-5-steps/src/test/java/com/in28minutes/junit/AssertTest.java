package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void equalsTest() {
        assertEquals(1, 1);
    }

    @Test
    public void notEqualsTest() {
        assertNotEquals(1, 2);
    }

    @Test
    public void trueTest() {
        boolean condition = true;
        assertTrue(condition);
    }

    @Test
    public void falseTest() {
        boolean condition = false;
        assertFalse(condition);
    }

    @Test
    public void nullTest() {
        Object object = null;
        assertNull(object);
    }

    @Test
    public void notNullTest() {
        Object object = new Object();
        assertNotNull(object);
    }

    @Test
    public void arrayEqualsTest() {
        int[] expecteds = new int[]{1, 2, 3};
        int[] actuals = new int[]{1, 2, 3};
        assertArrayEquals(expecteds, actuals);
    }
}
