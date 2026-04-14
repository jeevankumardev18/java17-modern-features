package com.tap.java17.day2;

import java.util.Arrays;
import java.util.List;

public class VarBasics
{

    public static void main(String[] args)
    {
        //Normal Usage
        List<String > names= Arrays.asList("Jeevan","RamCharan");
        for(String hero :names){
            System.out.println(hero);
        }

        // By Using VAR Keyword
        var list= List.of("Java","SpringBoot","Microservices");
        for(var s:list)
        {
            System.out.println(s);
        }
    }
}
