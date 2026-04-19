package com.tap.java17.day7;

sealed abstract class Order permits OnlineOrder, StoreOrder,PickupOrder
{
   public abstract void processOrder();
}

final class OnlineOrder extends  Order
{
    @Override
    public void processOrder()
    {
        System.out.println("Online order processed");
    }
}

final class StoreOrder extends  Order
{
    @Override
    public void processOrder()
    {
        System.out.println("Store order processed");
    }
}
final class PickupOrder extends Order {
    @Override
    public void processOrder() {
        System.out.println("Pickup order ready");
    }
}
public class SealedClassesChallenge
{
    public static void main(String[] args)
    {
       Order o= new OnlineOrder();
       o.processOrder();

       Order o1=new StoreOrder();
       o1.processOrder();

       Order o2=new PickupOrder();
       o2.processOrder();
    }
}
