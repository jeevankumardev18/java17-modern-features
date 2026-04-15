package com.tap.java17.day3;
enum Season
{
    WINTER,
    SPRING,
    SUMMER,
}


public class SwitchExpressionsWithEnums
{
    public static void main(String[] args)
    {
        var currentSeason=Season.WINTER;
        var activity=switch (currentSeason)
        {
            case WINTER -> "Chill to live in Bangalore";
            case SPRING -> "Good to see Beautiful trees" ;
            case SUMMER -> "Fun with RCB Bangalore";
            default -> "Anyways Bangalore is superb";
        };
        System.out.println(activity);
    }
}
