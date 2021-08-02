package com.datastructures.linkedlist.circular;

import com.datastructures.linkedlist.singly.Node;

public class SinglyCircularLinkedList {

    public Node head;
    public Node MakeCircularLinkedList(Node n) {
        Node tr = n;
        while (tr.next != null) {
            //System.out.println(tr.data);
            tr = tr.next;
        }
        tr.next = n;
        return n;

    }
    public void addAtHead(Node ne) {
        Node tr=head;
        do {
            tr=tr.next;
        }
        while(tr.next!=head);

        if (head != null) {
            ne.next = this.head;

        }
        this.head=ne;
        tr.next=head;

    }
    public void addAtHeadWithData(int d)
    {
        Node ne=new Node(d);
        Node tr=head;
        do {
            tr=tr.next;
        }
        while(tr.next!=head);

        if (head != null) {
            ne.next = this.head;

        }
        this.head=ne;
        tr.next=head;


    }
    public void insertAtNth(int pos,Node ne)
    {
        Node tr=head;
        int counter=1;
        Node prev=null;
        if(pos==1)
        {
            addAtHead(ne);
        }
        do{
            if(counter==pos)
            {
                prev.next=ne;
                ne.next=tr;
                break;
            }
            counter++;
            prev=tr;
            tr=tr.next;
        }
        while(tr!=head);

    }


    public void PrintList()
    {
        Node tr=this.head;

        do {
            System.out.println(tr.data);
            tr = tr.next;

        } while (tr != this.head);
    }


}
