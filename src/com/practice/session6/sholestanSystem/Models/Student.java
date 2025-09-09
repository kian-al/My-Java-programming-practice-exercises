package com.practice.session6.sholestanSystem.Models;

public class Student {
    int stdNo;
    String firstName;
    String lastName;
    public Student(int stdNo,String firstName,String lastName){
        this.stdNo=stdNo;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
