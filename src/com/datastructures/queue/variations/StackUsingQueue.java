package com.datastructures.queue.variations;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    // To maintain current number of
    // elements
    static int curr_size;



    static void push(int x)
    {
        curr_size++;


        q2.add(x);


        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }


        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void pop()
    {

        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
        curr_size--;
    }

    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
}
