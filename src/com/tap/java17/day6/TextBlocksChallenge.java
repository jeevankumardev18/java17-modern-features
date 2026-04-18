package com.tap.java17.day6;

//real-world Backend usage
public class TextBlocksChallenge
{
    public static void main(String[] args)
    {
        var age=23;
        var query= """
                SELECT * FROM users
                WHERE age > %d
                ORDER BY name;
                """.formatted(age);
        System.out.println(query);
    }
}

// %d is format specifier....
