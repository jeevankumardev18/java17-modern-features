package com.tap.java17.day7;

sealed class Shape permits Circle
{
    public void learn()
    {
        System.out.println("Shapes are many types");
    }

}
final class Circle extends Shape
{
    @Override
    public  void learn()
    {
        System.out.println("Circle is one shape area is πr2");
    }

}
// class Rectangle extends Shape {}  error.... because sealed restricts Rectangle class to extends

public class SealedClassesBasics {
    public static void main(String[] args){
       Circle c=new Circle();
       c.learn();

    }
}

//3-line explanation
//sealed restricts which classes can extend a class
//You explicitly define who can inherit
// Helps in controlled domain modeling

//Each subclass must be:
//final → cannot extend further
//sealed → restrict further
//non-sealed → open for all
//“Sealed classes provide controlled inheritance.”