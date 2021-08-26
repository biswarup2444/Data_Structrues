package com.datastructures.queue.variations;

public class StackWithDequeue {

    Dequeue dq=new Dequeue();

    public void push(int i)
    {
        dq.insertAtRear(i);
    }

    public int pop()
    {
        return dq.deleteRear();
    }

    public boolean isEmpty()
    {
        return dq.isEmpty();
    }
}
