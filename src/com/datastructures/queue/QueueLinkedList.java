package com.datastructures.queue;

import com.datastructures.linkedlist.singly.Node;

public class QueueLinkedList {

    public Node head=null;
    public Node tail=null;
    static int size=0;
    public void enqeue(int data)
    {
        Node n=new Node(data);
           if(size==0)
           {
               System.out.println("in size ");
               head=n;
               tail=n;
               size++;
               return;
           }
        
        tail.next=n;
        tail=tail.next;
        size++;



    }

    public int deqeue()
    {
        int h=0;
        if(isEmpty())
            return  0;
        if(head!=null)
        {   h=head.data;
            head=head.next;
        }
        size--;
        return h;

    }

    public boolean isEmpty()
    {
        if(head==null && tail==null)
            return  true;
        return  false;
    }

    public int size()
    {
        return size;
    }


}
