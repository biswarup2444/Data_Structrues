package com.datastructures.queue.priorityqueue;

public class PriorityQueueUsingLinkedList {

    Node head;

    public void enqueue(int v,int p)
    {
        Node n=new Node(v,p);
        if(head==null)
            head=n;
        else if(n.priority>=head.priority)
        {
            n.next=head;
            head=n;
        }
        else
        {
            Node t=head;
            while(t.next!=null&&n.priority<t.next.priority)
            {
                t=t.next;
            }
            n.next=t.next;
            t.next=n;

        }
    }
    public int dequeue()
    {
        if(isEmpty())
            return -1;
        int r=head.value;
        head=head.next;
        return r;
    }
    public void printAll()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.println(t.value+"\t"+t.priority);
            t=t.next;
        }
    }
    public boolean isEmpty()
    {
        return head==null;
    }
}
