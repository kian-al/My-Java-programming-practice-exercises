package com.practice.session6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreasureChest {
    private final List<String> clues = new ArrayList<>();
    private final Map<String, Integer> locationMap = new HashMap<>();

    public void addClue(String clue, int steps) {
        clues.add(clue);
        locationMap.put(clue,steps);
    }

    public void removeClue(String clue) {
        if (clues.contains(clue)) {
            clues.remove(clue);
            locationMap.remove(clue);
        }
    }

    public List<String> getAllClue() {
        return clues;
    }


    public int totalSteps(String targetClue) {
        int resultStepes=0;
        int step=0;
        int indexTarget= clues.indexOf(targetClue);
        for (int i = 0; i <= indexTarget; i++) {
            step=locationMap.get(clues.get(i));
            resultStepes+=step;
        }
        return resultStepes;
    }

    public String decipherMap() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < clues.size(); i++) {
            String clue = clues.get(i);
            int step = locationMap.get(clue);

            result.append("Index: ").append(i)
                    .append(" , Clue: ").append(clue)
                    .append(" , Step: ").append(step);

            if (i < clues.size() - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}