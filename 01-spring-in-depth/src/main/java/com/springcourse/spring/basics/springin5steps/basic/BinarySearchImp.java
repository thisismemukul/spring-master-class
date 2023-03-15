package com.springcourse.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImp {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private  SortAlgorithm sortAlgorithm;

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
//    @PostConstruct
//    public void postConstruct(){
//    logger.info("postConstruct");
//    }
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy");
//    }
}
