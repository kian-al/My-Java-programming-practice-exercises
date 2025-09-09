package com.practice.session6.JavadInTheWarAgainstAI;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AdvanceQueue<T> extends PriorityQueue<T>{
    public T peekNext(){
        return this.peek();
    }
    public void insertAtStart(T item){
        List<T> temp = new ArrayList<>();
        while (!this.isEmpty()) {
            temp.add(this.poll());
        }

        this.add(item);

        for (T element : temp) {
            this.add(element);
        }
    }
}