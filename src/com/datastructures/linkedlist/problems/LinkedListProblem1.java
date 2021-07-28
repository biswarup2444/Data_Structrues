package com.datastructures.linkedlist.problems;

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

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }

    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }

    public static void main(String[] args) {
        Node n=new Node(11,new Node(22,new Node(33,new Node(44,new Node(55)))));
        //sl.deleteTail(n);
        LinkedListProblem1 l1=new LinkedListProblem1();
        l1.changeLinkedListOrder(n);
        l1.printAll(n);

    }
}