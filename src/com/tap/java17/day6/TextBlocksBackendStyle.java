package com.tap.java17.day6;

public class TextBlocksBackendStyle
{
    public static void main(String[] args)
    {
        var jsonData= """
                {
                    "userName" : "Krish",
                    "email" : "krish22@gmail.com",
                    "password":"EncodedPasswordHere"
                    "age":23
                }
                
                """;

        System.out.println(jsonData);
    }
}
