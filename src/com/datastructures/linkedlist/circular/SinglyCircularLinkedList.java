package com.datastructures.linkedlist.circular;

import com.datastructures.linkedlist.singly.Node;

public class SinglyCircularLinkedList {
    public Node head;

    public void MakeCircularLinkedList(Node n) {
        Node tr = n;
        while (tr.next != null) {
            //System.out.println(tr.data);
            tr = tr.next;
        }
        tr.next = n;
        head=n;
    }
    public void addAtHead(Node ne)
    {
       if(head!=null)
       {
           ne.next=head;

       }
       this.head=ne;

    }
    public void insertAtNth(int pos,Node ne)
    {
        Node tr=head;
        int counter=1;
        Node prev=null;
        if(pos==1)
        {
            this.addAtHead(ne);
            return;
        }
        do{
            //System.out.println(counter);
            if(counter==pos && prev!=null)
            {

                prev.next=ne;
                ne.next=tr;
                return;


            }
            counter++;
            prev=tr;
            tr=tr.next;


        }
        while(tr!=head);
    }


    public void PrintList()
    {
        Node tr=head;

        do {
            System.out.println(tr.data);
            tr = tr.next;

        } while (tr != head);
    }


}
