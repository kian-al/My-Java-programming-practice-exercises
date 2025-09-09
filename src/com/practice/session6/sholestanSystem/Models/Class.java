package com.practice.session6.sholestanSystem.Models;

public class Class {
    int classId;
    String className;

    public Class(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
