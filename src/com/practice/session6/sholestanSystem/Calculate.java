package com.practice.session6.sholestanSystem;


import com.practice.session6.sholestanSystem.Models.Class;
import com.practice.session6.sholestanSystem.Models.Enrollment;
import com.practice.session6.sholestanSystem.Models.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate {

    public List<String> countAllClasses(List<Enrollment> enrollments) {
        Map<Integer, Long> classCount = enrollments.stream()
                .collect(Collectors.groupingBy(
                        enrollment ->
                                enrollment.getClassId(),
                        Collectors.counting()
                ));
        List<Map.Entry<Integer, Long>> sortedList = classCount.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toList());
        List<String> result = sortedList.stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.toList());
        return result;
    }

    public int countClassStudents(List<Enrollment> enrollments, int getClassId) {
        return (int) enrollments.stream()
                .filter(enrollment -> enrollment.getClassId() == getClassId)
                .count();
    }

    public int countStudentClasses(List<Enrollment> enrollments, int stdNo) {
        return (int) enrollments.stream()
                .filter(enrollment -> enrollment.getStdNo() == stdNo)
                .map(enrollment -> enrollment.getClassId())
                .distinct()
                .count();

    }

    public String getStudentFullName(List<Student> students, int stdNo) {
        return students.stream()
                .filter(student -> student.getStdNo() == stdNo)
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .findFirst()
                .orElse("Student not found");
    }

    public List<String> getStudentClassNames(List<Class> classes, List<Enrollment> enrollments, int stdNo) {
        List<Integer> studentsgetClassIds = enrollments.stream()
                .filter(enrollment -> enrollment.getStdNo() == stdNo)
                .map(enrollment -> enrollment.getClassId())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        return classes.stream()
                .filter(item -> studentsgetClassIds.contains(item.getClassId()))
                .sorted(Comparator.comparingInt(item -> item.getClassId()))
                .map(item -> item.getClassName())
                .collect(Collectors.toList());

    }
}
