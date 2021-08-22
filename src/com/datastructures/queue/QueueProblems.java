package com.datastructures.queue;


public class QueueProblems {

    public Queue reverseQueue(Queue q)
    {
        if(q.isEmpty())
            return new Queue();
        int val=q.dequeue();
        q=this.reverseQueue(q);
        q.enqueue(val);
        return q;
    }
}
