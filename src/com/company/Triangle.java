package com.company;

public class Triangle extends Polygon{

    public Triangle(double a , double b , double c){
        super(a,b,c,0);

    }
    //to see here if the side of triangle are equals
    public boolean isEquilateral(){
        if (sides[0]==sides[1] && sides[1]==sides[2]){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double calculateArea(){
        double s = (sides[0]+sides[1]+sides[2])/2;
        double Area = s*Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2])) ;
        return Area;
    }
    @Override
    public String toString(){
        return "Triangle of sides  " + String.valueOf(sides[0]) +" " + String.valueOf(sides[1]+" " + String.valueOf(sides[2]));
    }

    @Override
    public void draw (){
        System.out.println("Triangle of perimeter " +String. format("%.2f", calculatePerimeter()) +" and area : " + String. format("%.2f", calculateArea()));
    }
}
