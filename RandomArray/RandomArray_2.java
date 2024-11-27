// Create an array of 100 random numbers. 
// Use two-step array allocation. 
// Print out the sum of the square roots of the values.

// package com.dangkhoi14;

import java.util.ArrayList;
import java.util.List;

public class RandomArray_2 {
    public static void main(String[] args) {
        // double[] randomNumbers = new double[100];
        List<Double> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            randomNumbers.add(Math.random());
        }

        System.out.println("Sum = " + randomNumbers.stream().mapToDouble(Double::doubleValue).sum());
    }
}
