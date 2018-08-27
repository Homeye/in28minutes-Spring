package com.in28minutes.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("@Before running before every tests");
    }

    @After
    public void after() {
        System.out.println("@After running after every tests");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass running before the first test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass running after the last test");
    }

    @Test
    public void sumWith3Numbers() {
        System.out.println("Test1");
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sumWith1Number() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[]{3}));
    }
}