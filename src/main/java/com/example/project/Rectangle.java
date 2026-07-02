package com.example.project;

public class Rectangle implements Shape {
    // TODO: add fields as needed
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // TODO: store parameter(s)
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO: compute and return area
        if(width<=0 || height<=0){
            return 0;
        }
        double area = width * height;
        return area;
    }
}
