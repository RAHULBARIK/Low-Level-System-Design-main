package org.example.designPattern.FactoryPattern;

public class Main {

    public  static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape  shape = factory.getShape("CIRCLE");
        shape.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();
    }




}
