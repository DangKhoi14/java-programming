package CircleObject;


// package com.dangkhoi14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleObject {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        Random random = new Random();

        // Add Circle objects with random radius until Math.random() < 0.01
        double radius = random.nextDouble() * 10;
        circles.add(new Circle(radius));
        while (radius >= 0.01) {
            radius = random.nextDouble() * 10; // radius between 0 and 10
            circles.add(new Circle(radius));
        }

        // Loop through the list and print each area
        for (int i = 0; i < circles.size(); i++) {
            System.out.println("Circle " + (i+1) + " Area: " + circles.get(i).getArea());
        }
    }
}