package com.company;
/**
 * this class in this project is used to print all information about shhape
 * @version 0.0
 * @authoe Hassanein AL MAssry
 */

import java.util.ArrayList;

public class Paint {
    //define an array list from the shapes
    ArrayList <Shape> shapes = new ArrayList<>();
    //the add shape function
    public void addShape(Shape shape){
        shapes.add(shape);
    }
//print all information anout shape
    public void printAll(){
        for (Shape shape :shapes)
            System.out.println(shape.toString());
    }
    //draww all from draw function
    public void drawALl(){
        for (Shape shape :shapes){
            shape.draw();
        }
}
}
