package com.practice.session3.RetiredProgrammer;

import java.util.ArrayList;

public class Drug {
    String name;
    int amount;
    int price;
    public Drug(String name,int amount,int price){
        this.name=name;
        this.amount=amount;
        this.price=price;
    }
    public int getTotalPrice(){
        return this.amount*this.price;
    }


}
