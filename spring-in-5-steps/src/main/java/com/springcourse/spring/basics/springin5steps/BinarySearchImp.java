package com.springcourse.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
    @Autowired
    private  SortAlgorithm sortAlgorithm;

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
