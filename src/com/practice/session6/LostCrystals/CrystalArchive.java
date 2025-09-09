package com.practice.session6.LostCrystals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CrystalArchive {
    List<Crystal> crystals=new ArrayList<>();
    public void addCrystal(Crystal name){
        if (crystals.contains(name)){
            throw new IllegalArgumentException("Duplicate username: "+name);
        }
        crystals.add(name);
    }
    public List<Crystal> findByColor(String color){
        return crystals.stream()
                .filter(item-> color.equals(item.color()))
                .collect(Collectors.toList());
    }
    public double calculateTotalEnergy (){
        return crystals.stream()
                .filter(item->item.expirationYear()>=1403)
                .mapToDouble(Crystal::energyLevel)
                .sum();
    }
    public Crystal getMostPowerful(){
        return crystals.stream()
                .max(Comparator.comparingDouble(Crystal::energyLevel))
                .orElse(null);

    }
}
