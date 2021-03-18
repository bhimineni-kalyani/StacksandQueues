package com.bridgelabz;

import java.util.LinkedList;

public class StacksandQueues4<B extends Comparable> {
    LinkedList list = new LinkedList();

    public void push(B value) {
        this.list.addLast(value);
        this.list.displayList();
    }

    public void pop() {
        this.list.deleteFirstElement();
        this.list.displayList();
    }

    public void Queue_push(B value) {
        this.list.addLast(value);
        this.list.displayList();
    }

    public void Queue_pop() {
        this.list.deleteFirstElement();
        this.list.displayList();
    }
}