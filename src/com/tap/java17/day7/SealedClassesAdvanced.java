package com.tap.java17.day7;

sealed class Vehicle permits Car {}

non-sealed class Car extends Vehicle {}

class SportCar extends Car
{
    public void name()
    {
        System.out.println("Ferrari is a SportsCar");
    }

}


public class SealedClassesAdvanced
{
    public static void main(String[] args)
    {
        SportCar car=new SportCar();
        car.name();
    }
}
