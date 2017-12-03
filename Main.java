package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        testRectangle();
    }

    public static void testRectangle()
    {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println("The area for the default rectangle is: "+rectangle1.calculateArea());
        System.out.println("The perimeter for the default rectangle is: "+rectangle1.calculatePerimeter());
        Rectangle rectangle2 = new Rectangle(3,4,"red");
        System.out.println(rectangle2.toString());
        System.out.println("The area for the second rectangle is: "+rectangle2.calculateArea());
        System.out.println("The perimeter for the second rectangle is: "+rectangle2.calculatePerimeter());
    }
}
