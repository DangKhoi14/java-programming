// Create an array of 4 random numbers (each between 0 and 1). 
// Use one-step array allocation. 
// Loop down the array and print out the values.

// package com.dangkhoi14;

public class RandomArray {
    public static void main(String[] args) {
        double[] randomNumbers = {Math.random(), Math.random(), Math.random(), Math.random()};
        
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Random number " + (i+1) + ": " + randomNumbers[i]);
        }
    }
}
