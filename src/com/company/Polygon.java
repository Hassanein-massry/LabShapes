package com.company;

import java.util.Arrays;

public class Polygon extends Shape {
    /**
     * get the sides's values
     * @return sides[]
     */
    public double[] getSides() {
        return sides;
    }
    //definition of sides

    double [] sides = new double[4];
    public Polygon(double a , double b , double c , double d){
        sides[0]=a;
        sides[1]=b;
        sides[2]=c;
        sides[3]=d;
    }

    /**
     * this method is overrided from the shape's class and return the value of peremiter of every polygon rectangle or triangle
     * @return the peremiter
     */
    @Override
    public double calculatePerimeter(){
        return sides[0]+sides[1]+sides[2]+sides[3];
    }



}
