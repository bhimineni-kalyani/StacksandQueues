package com.bridgelabz;

import java.util.LinkedList;

public class StacksandQueues3<B extends Comparable> {
        LinkedList<Object> list = new LinkedList();

        public void push(B value) {
            this.list.addLast(value);
            this.list.displayList();
        }
        
        public void pop() {
            this.list.removeFirst();
            this.list.displayList();
        }

        public void Queue_push(B value) {
            this.list.addLast(value);
            this.list.displayList();
        }
}