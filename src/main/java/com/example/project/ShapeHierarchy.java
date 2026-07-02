package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // TODO: create a list/array of shapes and print each area (polymorphism)
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add( new Circle(1));
        shapes.add( new Rectangle(2,3));
        shapes.add( new Triangle(3, 4));

        for (int i =0; i<shapes.size();i++){
            System.out.println("El area es: "+shapes.get(i).getArea());
        }
        System.out.println("--------Desde for each--------");
        for (Shape  sape : shapes){
            System.out.println("El area: "+sape.getArea());
        }
    }
}
