package com.cucumber.stepdefination;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MissingElementsFromArray {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World...");
        //Finding the missing numbers from the array
        int arr[] = {1,8,3};

        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }

        //sort the array and find the max number
       Collections.sort(list);
        // this will sort the array in ascending order.
        //largest number at the end

        int maxElement = list.get(list.size()-1);
        System.out.println(maxElement);

        //as we found the max number,
        //so now we will check till that number whether all the numbers till that element is present or not
        ArrayList<Integer> missingElements = new ArrayList<>();

        for(int i=1; i<=maxElement; i++){
            if(!list.contains(i)){
                missingElements.add(i);
            }
        }
        System.out.println(list);
        System.out.println("Missing Elements");
        System.out.println(missingElements);
    }
}
