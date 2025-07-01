package com.practice.session3.SuccessfulHoldingCompany;

public class Blacksmith extends Craftsman{

    @Override
    public String craftsmanSkill() {
        return "The Blacksmith forges a mighty sword";
    }

    @Override
    public void createItem() {
        System.out.println("Forging a sword from raw iron...");
    }

    @Override
    public void displayItem() {
        System.out.println("Displaying the sword with a shimmering blade in the shop.");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling the sword to a brave knight.");
    }

}
