package com.tap.java17.day4;

record Product(String productName,double productPrice)
{
    public Product
    {
        if(productPrice < 0)
        {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}
public class RecordsChallenge
{
    public static void main(String[] args)
    {
        var productDetails=new Product("FaceCream",150.72);
        System.out.println(productDetails.productName());
        System.out.println(productDetails.productPrice());
    }
}
