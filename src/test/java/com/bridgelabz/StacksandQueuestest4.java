package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StacksandQueuestest4 {
    StacksandQueues4 stacksandqueue4;

    @Before
    public  void setup() {
        stacksandqueue4 = new StacksandQueues4();
    }

    @Test
    public void aadAtEnd() {
        stacksandqueue4.push(56);
        stacksandqueue4.push(30);
        stacksandqueue4.push(70);
    }

    @Test
    public void pop_at_front() {
        int i=0;
        stacksandqueue4.push(56);
        stacksandqueue4.push(30);
        stacksandqueue4.push(70);
        System.out.println("Delete after");
        while(i < 3) {
            stacksandqueue4.pop();
            i++;
        }
    }

    @Test
    public void AddAtEnd() {
        stacksandqueue4.Queue_push(56);
        stacksandqueue4.Queue_push(30);
        stacksandqueue4.Queue_push(70);
    }

    @Test
    public void deleteAtfirst() {
        int i=0;
        stacksandqueue4.Queue_push(56);
        stacksandqueue4.Queue_push(30);
        stacksandqueue4.Queue_push(70);
        System.out.println("Delete after");
        while(i<3) {
            stacksandqueue4.Queue_pop();
            i++;
        }
    }
}