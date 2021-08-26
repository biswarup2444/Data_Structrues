package com.datastructures.queue.variations;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    Queue<Integer> q = new LinkedList<Integer>();

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public void push(int x) {
        int size = q.size();
        q.add(x);

        for (int i = 0; i < size; i++) {
            int v = q.remove();
            q.add(v);
        }
    }

    public int pop()
    {
        if(q.isEmpty())
            return -1;
        return q.remove();
    }

    public int peek()
    {
        if(q.isEmpty())
            return -1;
        return q.peek();
    }
}
