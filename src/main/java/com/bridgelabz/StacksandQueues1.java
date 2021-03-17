package com.bridgelabz;

import java.util.LinkedList;

public class StacksandQueues1<B extends Comparable> {
    LinkedList list = new LinkedList();

    public void push(B value) {
        this.list.addLast(value);
        this.list.displayList();
    }
}