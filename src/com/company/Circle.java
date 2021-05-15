package com.company;

import java.security.PublicKey;

public class Circle extends Shape {
    private double Pi =3.14 ;
    /**
     * getting the radius value
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    //define the radius
    private double radius ;
    public Circle(double r ){
        this.radius=r;
    }

    /**
     * calculate the peremieter of circle
     * @return the parameter
     */
    @Override
    public double calculatePerimeter (){
        return 2*Pi*radius;
    }

    /**
     * calculate the area of circle
     * @return the area
     */
    @Override
    public double calculateArea(){
        return Pi*Math.pow(radius,2);
    }

    /**
     * some information of circle shape
     * @return String
     */
    @Override
    public String toString(){
        return "Circle  of radius  " + String.valueOf(radius);
    }

    /**
     * information for the circle shape
     */
    @Override
    public void draw (){
        System.out.println("Circle of Circumference  " + String. format("%.2f", calculatePerimeter()) +" and area : " +String. format("%.2f", calculateArea()));
    }




}
