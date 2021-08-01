package com.datastructures.linkedlist.problems;

import com.datastructures.linkedlist.singly.Node;

public class LinkedListProblem1 {
    public void changeLinkedListOrder(Node head)
    {
        Node newNode=null;
        int range_end=size(head);
        Node tail=tailNode(head);
        //System.out.println(tail.data);
        Node prev=head;
        head=head.next;

        for(int i=0;i<range_end/2;i++)
        {
            prev.next=head.next;
            tail.next=head;
            tail=tail.next;

            prev=prev.next;
            head=prev.next;


        }

        tail.next=null;

    }
    public Node tailNode(Node head)
    {
        while(head.next!=null)
        {
            head=head.next;

        }
        return head;
    }
    public int size(Node head)
    {
        int counter=0;
        while(head!=null)
        {
            head=head.next;
            counter++;
        }
        return counter;
    }

    public void printAll(Node n)
    {
             while(n!=null)
             {
                System.out.println(n.data);
                n=n.next;
             }

    }
}

