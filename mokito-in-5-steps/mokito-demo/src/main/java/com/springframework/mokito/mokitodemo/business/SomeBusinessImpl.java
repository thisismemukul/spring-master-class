package com.springframework.mokito.mokitodemo.business;

public class SomeBusinessImpl {
    private DataService dataService;
    public int findTheGreatestFromAllData(){
        int[] data = dataService.retriveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value:data){
            if (value>greatestValue){
                greatestValue=value;
            }
        }
        return greatestValue;
    }
}
interface DataService{
    int[] retriveAllData();
}
