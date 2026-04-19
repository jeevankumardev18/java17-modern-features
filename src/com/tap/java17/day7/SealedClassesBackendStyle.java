package com.tap.java17.day7;

sealed class Payment permits CardPayment , UPIPayment {}

final class CardPayment extends  Payment {}
final class UPIPayment extends  Payment {}


public class SealedClassesBackendStyle
{
    public static void main(String[] args)
    {
        Payment payment= new CardPayment();
        if(payment instanceof CardPayment)
        {
            System.out.println("Card Payment processing!");
        } else if (payment instanceof UPIPayment)
        {
            System.out.println("UPI payment processing");
        }
    }
}
