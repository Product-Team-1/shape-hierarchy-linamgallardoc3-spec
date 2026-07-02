package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // TODO: create a list/array of shapes and print each area (polymorphism)
        //Array con valores permitidos
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add( new Circle(3));
        shapes.add( new Rectangle(2,3));
        shapes.add( new Triangle(3, 4));

        //Array con valores que pueden caurar erroes en el codigo
        ArrayList<Shape> shapes1 = new ArrayList<>();
        shapes1.add( new Circle(0));
        shapes1.add( new Rectangle(2,-3));
        shapes1.add( new Triangle(-3, 0));

        //For each para recorrer el array
        for (Shape shape : shapes) {
            System.out.println("El area es: " + shape.getArea());
        }

        System.out.println("--------Desde for each con valores errados--------");
        //For each recorriendo en array con valores errados
        for (Shape  sape : shapes1){
            System.out.println("El area es: "+sape.getArea());
        }
    }
}
