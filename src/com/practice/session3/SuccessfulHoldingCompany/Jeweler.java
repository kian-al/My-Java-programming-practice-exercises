package com.practice.session3.SuccessfulHoldingCompany;

public class Jeweler extends Craftsman{
    @Override
    public String craftsmanSkill() {
        return "The Jeweler crafts a radiant diamond ring";
    }

    @Override
    public void createItem() {
        System.out.println("Crafting a diamond ring with fine precision...");
    }

    @Override
    public void displayItem() {
        System.out.println("Showcasing the diamond ring under a bright spotlight.");
    }
    @Override
    public void sellItem() {
        System.out.println("Selling the diamond ring to an elegant customer.");
    }
}
