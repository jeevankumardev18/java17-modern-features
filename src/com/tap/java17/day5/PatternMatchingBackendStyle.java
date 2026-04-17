package com.tap.java17.day5;

record SuccessResponse(String message) {}
record ErrorResponse(String error) {}
public class PatternMatchingBackendStyle
{
    public static void main(String[] args)
    {
       Object response=new SuccessResponse("Order Placed");
        if(response instanceof SuccessResponse successResponse)
        {
            System.out.println(successResponse.message());
        } else if (response instanceof ErrorResponse errorResponse)
        {
            System.out.println(errorResponse.error());
        }
    }
}


// What problem does pattern matching solve? ---> 👉 Removes casting + improves readability