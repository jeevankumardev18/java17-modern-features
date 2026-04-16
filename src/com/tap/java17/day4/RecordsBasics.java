package com.tap.java17.day4;

//Normal Usage
class User
{
    private String userName;
    private String address;

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


// Java17 Usage Records...

record UserData(String hobby,String favColor) {}


public class RecordsBasics
{
    public static void main(String[] args)
    {
        //Normal Usage
        User user=new User("Rahul","Bangalore");
        System.out.println(user.getUserName()+ "->" + user.getAddress());


        //Java17 Usage
        var userData=new UserData("Gaming","Black");
        System.out.println(userData.hobby() + " " + userData.favColor());
    }



//    3-line explanation
//Record = immutable data class
//Automatically generates constructor, getters, toString, equals, hashCode
//Used mainly for DTOs in backend

}

