package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StacksandQueuestest2 {
    StacksandQueues2 stacksandqueue;

    @Before
    public  void setup() {
        stacksandqueue = new StacksandQueues2();
    }

    @Test
    public void push_at_back() {
        stacksandqueue.push(56);
        stacksandqueue.push(30);
        stacksandqueue.push(70);
    }

    @Test
    public void pop_at_front() {
        int i=0;
        stacksandqueue.push(56);
        stacksandqueue.push(30);
        stacksandqueue.push(70);
        System.out.println("Delete after");
        while(i < 3) {
            stacksandqueue.pop();
            i++;
        }
    }
}