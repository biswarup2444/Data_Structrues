package com.datastructures.queue.variations;

public class QueueWithDequeue {
    Dequeue dq=new Dequeue();

    public  void enqueue(int i)
    {
        dq.insertAtRear(i);
    }

    public  int dequeue()
    {
        if(dq.isEmpty())
            return -1;
        return  dq.deleteFront();
    }

    public boolean isEmpty()
    {
        return dq.isEmpty();
    }
}
