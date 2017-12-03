package com.company;

public class Rectangle {
    //private instance declarations
    private double side1;
    private double side2;
    private String color;

    //set and get functions for each instance variable
    public void setSide1(double rectSide1)
    {
        side1=rectSide1;
    }
    public double getSide1(){
        return side1;
    }
    public void setSide2(double rectSide2)
    {
        side2=rectSide2;
    }
    public double getSide2()
    {
        return side2;
    }
    public void setColor(String rectColor)
    {
        color=rectColor;
    }
    public String getColor(){
        return color;
    }

    //constructors
    public Rectangle()
    {
        side1=1.0;
        side2=1.0;
        color="white";
    }
    public Rectangle(double rectSide1, double rectSide2, String rectColor)
    {
        side1=rectSide1;
        side2=rectSide2;
        color=rectColor;
    }
    //calc methods
    public double calculateArea()
    {
        return (side1*side2);
    }
    public double calculatePerimeter()
    {
        return (2*(side1+side2));
    }
    //to string
    public String toString()
    {
        return String.format("Rectangle: two sides="+side1+"and the other two sides="+side2+".Color: "+color);
    }


}
