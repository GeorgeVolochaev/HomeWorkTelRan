package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static boolean onlyNumbersIsExist(Integer[] arr, Integer[] numbers){
        Set<Integer> arrSet = new HashSet<>(Arrays.asList(arr));
        Set<Integer> numSet = new HashSet<>(Arrays.asList(numbers));
        return arrSet.equals(numSet);
    }
}
