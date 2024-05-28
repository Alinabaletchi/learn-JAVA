package org.example.advance.circle;

import com.sun.source.tree.BreakTree;

//Write a Circle class that will contain information like:
//
//radius
//
//Hide class field access. Make the calculation mechanism public:
//circle field
//circumference of a circle
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public  double calculateCircumference(){
        return  2*Math.PI*radius;
    }

}
