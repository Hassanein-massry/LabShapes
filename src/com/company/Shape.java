package com.company;

/**
 * the super class
 * shape class that every other class inherit from it
 */
public class Shape {
    /**
     * the calculatePArameter method is used from other class for return the peremiter of shape/**
     * @return 1
     */
    public double calculatePerimeter (){
        return 1;
    }

    /**
     * the calculate area method is used to return the area of the shape
     * @return 0
     */

    public double calculateArea(){
        return 0;
    }

    /**
     * the draw method is used from other class to draw every simple shape
     */
    public void draw(){

    }

    /**
     * this method is used by other class for returning information from each class
     * @return 2
     */
    public String toString(){
        return "2";
    }

    /**
     * the equals method is also used from other class to comare 2 shape
     * @return
     */
    public Boolean equals(){
        return true;
    }



}
