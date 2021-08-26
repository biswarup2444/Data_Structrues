package com.datastructures;
import com.datastructures.queue.variations.CircularQueue;
import com.datastructures.queue.variations.CircularQueueUsingLinkedList;
import com.datastructures.queue.variations.Dequeue;
import com.datastructures.queue.variations.StackUsingQueue;

public class Main
{
    public static void main(String[] args)
    {
        CircularQueueUsingLinkedList cq=new CircularQueueUsingLinkedList();
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);

        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
    }
}
