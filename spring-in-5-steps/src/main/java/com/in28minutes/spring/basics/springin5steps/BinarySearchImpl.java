package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
