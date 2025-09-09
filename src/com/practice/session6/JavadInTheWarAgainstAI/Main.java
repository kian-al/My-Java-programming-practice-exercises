package com.practice.session6.JavadInTheWarAgainstAI;

public class Main {
    public static void main(String[] args) {
        AdvanceQueue<Integer> queue = new AdvanceQueue<>();
        queue.add(20);
        queue.add(30);
        queue.insertAtStart(10);

        Integer nextItem = queue.peekNext();
        System.out.println("Peek Next: " + nextItem); // Output: 10
    }
}
