package com.tap.java17.day3;

public class SwitchExpressionsBackend
{
    public static void main(String[] args)
    {
        var status="Success";
        var message= switch(status)
        {
           case "Success" -> "Order Placed Successfully";
           case "Failure" ->  "Payment Failed";
           case "Pending" ->  "Payment Pending";
            default -> "Unknown Status";
        };
        System.out.println(message);


        var role = "ADMIN";

        var access = switch(role){
            case "ADMIN" -> "Full Access";
            case "USER" -> "Limited Access";
            default -> "No Access";
        };

        System.out.println(access);
    }

//    3-line explanation
//    New switch returns a value directly
//    No need for break
//    Cleaner and no fall-through bugs
}
