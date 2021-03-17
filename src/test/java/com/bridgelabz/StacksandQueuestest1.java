package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StacksandQueuestest1 {
    StacksandQueues1 stacksandqueue ;

    @Before
    public void setup() {
        stacksandqueue = new StacksandQueues1();
    }

    @Test
    public void push_at_back() {
        stackandqueue.push(56);
        stackandqueue.push(30);
        stackandqueue.push(70);

    }
}