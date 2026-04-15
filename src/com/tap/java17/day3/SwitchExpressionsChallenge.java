package com.tap.java17.day3;

public class SwitchExpressionsChallenge
{
    public static void main(String[] args)
    {

        var num =6;
        var result=switch (num)
        {
            case 1->"One";
            case 2->"Two";
            case 3->"Three";
            case 4->"Four";
            case 5->"Five";
            default -> "Sixer Down The Ground";
        };
        System.out.println(result);

    }
}
