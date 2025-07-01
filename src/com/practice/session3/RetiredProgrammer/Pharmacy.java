package com.practice.session3.RetiredProgrammer;

import java.util.ArrayList;

public class Pharmacy {
    String name;
    ArrayList<Drug> drugArray=new ArrayList<>();
    ArrayList<Employee> employeesArray=new ArrayList<>();

    public Pharmacy(String name){
        this.name=name;
    }
    public void addDrug(Drug drug)
    {
        drugArray.add(drug);
    }

    public void addEmployee(Employee employee)
    {
        employeesArray.add(employee);
    }

    public int totalPrice()
    {
        int totalPrice=0;
        for (Drug drug:drugArray){
            totalPrice+= drug.getTotalPrice();
        }
        return totalPrice;
    }

    public String employeeSummary()
    {
        StringBuilder sb = new StringBuilder("Employees:\n");
        for (int i = 0; i < employeesArray.size(); i++) {
            Employee e = employeesArray.get(i);
            sb.append(String.format("The employee number %d is %s %s who is %d years old.\n",
                    i + 1, e.firstName, e.lastName, e.age));
        }
        return sb.toString();
    }
}
