package com.tap.java17.day4;

record View(String name,int age) {
    public View {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

}
// Above is a Compact Constructor....

public class RecordsValidation
{
    public static void main(String[] args)
    {
        var view=new View("Sony",23);
        System.out.println(view.age());
        System.out.println(view.name());

    }
}
