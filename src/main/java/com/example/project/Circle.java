package com.example.project;

public class Circle implements Shape {
    // TODO: add fields as needed
    private double radius;

    public Circle(double radius) {
        // TODO: store parameter(s)
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO: compute and return area
        if(radius<=0){
            return 0;
        }
        double area =  Math.PI * Math.pow(radius, 2);

        return area;
    }
}
