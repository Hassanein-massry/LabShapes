package com.company;

public class Rectangle extends Polygon{
    //constructor of the rectangle class
    public Rectangle(double a , double b , double c , double d){
        super(a,b,c,d);
    }

    /**
     * to see if the sides of recangles are equals
     * @return true or false
     */
    public boolean isSquare (){
        if (sides[0]==sides[1] && sides[1]==sides[2] && sides[3]==sides[2]){
            return true;
        }else {
            return false;
        }
    }
    //also calculate area
    @Override
    public double calculateArea(){
        return sides[0]*sides[1];
    }
/*
    @Override
    public double calculatePerimeter(){
        return 2*sides[1]+2*sides[0];
    }*/
    @Override
    public String toString(){
        return "rectangle of lenght " + String.valueOf(sides[0]) +" width " + String.valueOf(sides[1]);
    }
    @Override
    public void draw (){
        System.out.println("Rectangle of perimeter " +String. format("%.2f", calculatePerimeter())  +" and area : " + String. format("%.2f", calculateArea()));
    }
}
