package com.tap.java17.day5;

public class PatternMatchingChallenge
{
    public static void main(String[] args)
    {
        Object obj=100;
        if(obj instanceof Integer num )
        {
            System.out.println("Integer: "+num);
        }

        Object obj1="JEEVAN";
        if (obj1 instanceof String s)
        {
            System.out.println(s.toLowerCase());
        }
    }
}

