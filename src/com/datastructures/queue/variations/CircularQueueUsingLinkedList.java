package com.datastructures.queue.variations;

import com.datastructures.linkedlist.singly.Node;

public class CircularQueueUsingLinkedList {
    Node head=null;
    Node tail=null;

    public void enqueue(int x)
    {
        Node n=new Node(x);
        if(head==null)
        {
            head=n;
        }
        else
            tail.next=n;
        tail=n;
        tail.next=head;


    }

    public int dequeue()
    {
        if(head==null)
            return -1;
        int r=head.data;
        if(head==tail)
        {
            head=null;
            tail=null;

        }
        else {
            head=head.next;
            tail.next=head;
        }
        return r;
    }




}
