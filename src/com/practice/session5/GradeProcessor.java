package com.practice.session5;

import java.util.List;
import java.util.stream.Collectors;

public class GradeProcessor {

    public double calculateAverage(List<Integer> grades) {
        return grades.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
    }

    public int findMaxGrade(List<Integer> grades) {
        return grades.stream()
                .mapToInt(n -> n) 
                .max()
                .orElse(0);
    }

    public List<Integer> filterPassingGrades(List<Integer> grades) {
        return grades.stream()
                .filter(n -> n >= 10)
                .collect(Collectors.toList());
    }

    public List<Integer> boostGrades(List<Integer> grades) {
        return grades.stream()
                .map(n -> n + 2)
                .collect(Collectors.toList());
    }
}
