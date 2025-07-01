package com.practice.session3.SuccessfulHoldingCompany;

public class Potter extends Craftsman{

    @Override
    public String craftsmanSkill() {
        return "The Potter shapes a beautiful vase";
    }

    @Override
    public void createItem() {
        System.out.println("Shaping a vase from clay on a potter’s wheel...");
    }

    @Override
    public void displayItem() {
        System.out.println("Placing the vase on a shelf with artistic lighting.");
    }
    @Override
    public void sellItem() {
        System.out.println("Selling the vase to an art collector.");
    }
}
