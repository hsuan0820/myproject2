package com.le.sales;

public class Customer {
    String id;
    int amount;
    float off=0.1f;

    public Customer(String id, int amount){
        this.id=id;
        this.amount=amount;
    }
    public float backMoney(){
        return(amount/1000)*off*1000;
    }
}
