package com.practice.session6.JavadInTheWarAgainstAI;

import java.util.Stack;

public class AdvanceStack<T> extends Stack<T> {
    public T peekSecondLast() {
        if (this.size()<2){
            return null;
        }
        return elementAt(this.size()-2);
    }

    public void insertAtBottom(T item) {
        if (this.isEmpty()) {
            this.push(item);
            return;
        }

        T top = this.pop();
        insertAtBottom(item);
        this.push(top);
    }
}
