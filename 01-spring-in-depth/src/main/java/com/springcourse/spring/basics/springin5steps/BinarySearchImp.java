package com.springcourse.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
    @Autowired
    private  SortAlgorithm bubbleSortAlgorithm;

    public int binarySearch(int[] numbers, int numbertoSearchfor){
      //  BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
       int[] sortedNumbers= bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);

        //implementing sorting logic
        //bubble sort algo
        //search array
        //return the result
        return 3;
    }
}
