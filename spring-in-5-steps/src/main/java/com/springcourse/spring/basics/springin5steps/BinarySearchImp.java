package com.springcourse.spring.basics.springin5steps;

public class BinarySearchImp {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImp(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbertoSearchfor){
      //  BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
       int[] sortedNumbers= sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //implementing sorting logic
        //bubble sort algo
        //search array
        //return the result
        return 3;
    }
}
