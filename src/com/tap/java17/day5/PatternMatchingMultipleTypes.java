package com.tap.java17.day5;

public class PatternMatchingMultipleTypes
{
    public static void main(String[] args)
    {
       Object obj="Hello Bob";
       if(obj instanceof String s)
       {
           System.out.println("String: "+s);
       }
       else if(obj instanceof Integer num)
       {
           System.out.println("Integer: "+num);
       }
       else
       {
           System.out.println("Unknown type");
       }
    }
}
