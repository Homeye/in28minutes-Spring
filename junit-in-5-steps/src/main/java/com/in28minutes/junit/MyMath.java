package com.in28minutes.junit;

public class MyMath {

    public int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
