package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paint paint = new Paint();
        Shape shape = new Triangle(1,2,3);
        Shape shape1=new Rectangle(1,2,1,2);
        Shape shape2 = new Circle(2);
        paint.addShape(shape);
        paint.addShape(shape1);
        paint.addShape(shape2);
        paint.drawALl();
        paint.printAll();

    }
}
