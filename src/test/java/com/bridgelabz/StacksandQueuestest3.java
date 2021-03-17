package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StacksandQueuestest3 {
    StacksandQueues3 stacksandqueue;

    @Before
    public  void setup() {
        stacksandqueue = new StacksandQueues3();
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
        System.out.println("");
        while(i < 3) {
            stacksandqueue.pop();
            i++;
        }
    }

    @Test
    public void AddAtEnd() {
        stacksandqueue.Queue_push(56);
        stacksandqueue.Queue_push(30);
        stacksandqueue.Queue_push(70);
    }
}