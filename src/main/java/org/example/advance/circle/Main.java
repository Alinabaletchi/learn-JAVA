package org.example.advance.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(4);

       double radius= circle.getRadius();
        System.out.println("Radius is: " + radius);

        double circumferince= circle.calculateCircumference();
        System.out.println("Circumferince is: "+ circumferince);
    }
}
