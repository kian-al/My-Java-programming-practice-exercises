package com.practice.session6.LostCrystals;

public record Crystal(String name, double energyLevel, String color, int expirationYear) {
    public Crystal{
        if (energyLevel<=100){
            energyLevel=100;
        } else if (energyLevel>=1000) {
            energyLevel=1000;
        }
        if (expirationYear<1403) {
            System.out.println("This crystal has expired!");
        }
    }

}
