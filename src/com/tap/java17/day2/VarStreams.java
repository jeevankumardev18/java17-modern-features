package com.tap.java17.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarStreams
{
    public static void main(String[] args)
    {
        //Normal Usage
        List<Integer> numb= Arrays.asList(10,20,30,40);
        List<Integer> result=numb
                .stream()
                .filter(n->n>20)
                .toList();

        System.out.println(result);


        //By Using VAR Keyword Usage
        var numbers= List.of(1,2,3,4,5,6,7,8,9,10);

        var res=numbers
                .stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(res);

        var chars= Arrays.asList("A","B","C");
        chars.stream().forEach(System.out::println);
    }
}
