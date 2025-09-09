package com.practice.session6.sholestanSystem.Models;

public class Enrollment {
    int stdNo;
    int classId;
    String enrollDate;

    public Enrollment(int stdNo, int classId, String enrollDate) {
        this.stdNo = stdNo;
        this.classId = classId;
        this.enrollDate = enrollDate;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Enrollment(int stdNo, int classId) {
        this(stdNo, classId, "Unknown");
    }
}
