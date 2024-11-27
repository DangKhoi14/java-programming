// Make a program that flips a coin 10 times, 
// saying “heads” or “tails” each time. 
// Recall that Math.random() returns a double between 0 and 1.

// package com.dangkhoi14;

public class CoinFlip {
    public static void main(String[] args) {
        double coinFlip;
        for (int i = 0; i < 10; i++) {
            coinFlip = Math.random();

            if (coinFlip < 0.5) {
                System.out.println("Flip " + i + ": heads");
            } else {
                System.out.println("Flip " + i + ": tails");
            }
        }
    }
}