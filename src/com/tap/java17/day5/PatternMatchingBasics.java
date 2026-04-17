package com.tap.java17.day5;

record User(String name) {}
public class PatternMatchingBasics
{
    public static void main(String[] args)
    {
        //Java17 Usage
       Object obj=new User("Maggy");
       if(obj instanceof User user)
       {
           System.out.println(user.name());
       }

       //Old Style Casting is required
       if(obj instanceof User)
       {
           User user=(User)obj;
           System.out.println(user.name());
       }


    }
}

//3-line explanation
//Removes manual casting after instanceof
//Declares variable directly inside condition
//Cleaner + safer code
