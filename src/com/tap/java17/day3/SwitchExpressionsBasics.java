package com.tap.java17.day3;

public class SwitchExpressionsBasics
{
    public static void main(String[] args)
    {

        //Normal Java 8 Usage
        String day="Monday";

        String result;
        switch(day)
        {
            case "Monday" : result ="Workday";
            break;
            case "Saturday" : result="Funday";
            break;
            default:result="Unknown";
        }
        System.out.println(result);


        // Java17 Usage
        var day1="Sat";
        var res=switch (day1)
        {
            case "Mon" -> "Work";
            case "Sat" -> "Fun";
            default -> "Unknown";
        };
        System.out.println(res);




        // Jav17 Usage
        var day2="Sun";
        var results=switch(day2)
        {
            case "Mon", "Tues","Wed","Thur","Fri" -> "WorkDay";
            case "Sat","Sun" -> "Weekend";
            default -> "IT Work";
        };
        System.out.println(results);
    }
}
