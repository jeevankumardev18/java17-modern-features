package com.tap.java17.day4;

record Order(String orderName,double amount) {}

public class RecordsOrderService
{
    public static void main(String[] args) {
        var order=new Order("Cetaphil Gentle Cleanser",437.7);
        System.out.println(order.orderName());
        System.out.println(order.amount());

    }


    //Key Rules remember it
    // ✔ Record is immutable
    //✔ Fields are final
    //✔ Cannot extend other classes
    //✔ Can implement interfaces
}
