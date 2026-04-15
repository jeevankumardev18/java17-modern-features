package com.tap.java17.day3;

public class SwitchExpressionsYieldLogic
{
    public static void main(String[] args)
    {
        var num=5;
        var result=switch(num)
        {
            case 1,2,3 -> "Low";
            case 4,5,6 -> {
                System.out.println("Medium range");
                yield "Med";
            }
            case 7,8,9,10 -> "High";
            default -> "I Think Number is more";

        };
        System.out.println(result);
    }

    //What is yield? -> 👉 Used to return value inside block
}
