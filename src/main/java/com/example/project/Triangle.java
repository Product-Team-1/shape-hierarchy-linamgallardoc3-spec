package com.example.project;

public class Triangle implements Shape {
    // TODO: add fields as needed
    private double base;
    private double height;
    public Triangle(double base, double height) {
        // TODO: store parameter(s)
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO: compute and return area
        if(base<=0 || height<=0){
            return 0;
        }
        double area = (base*height)/2;
        return area;
    }
}
