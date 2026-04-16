package com.tap.java17.day4;

record  UserDto(String name,String email){}


public class RecordsBackend
{
    public static void main(String[] args)
    {
        var userDto= new UserDto("Krishna","krish18@gmail.com");
        System.out.println(userDto.email());
        System.out.println(userDto.name());
    }
}
