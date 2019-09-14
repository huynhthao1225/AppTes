package com.myapp.appassembler.challenge;

import java.util.HashMap;

public class FindTwoNumbersSumOfTarget {

    public int[] findThem(int[] numbers, int target) {

        HashMap<Integer, Integer> processedMunbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++ ) {
            int value = target - numbers[i];
            if (processedMunbers.containsKey(value)) {
                return new int[] {processedMunbers.get(value), i};
            } else {
                processedMunbers.put(numbers[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
