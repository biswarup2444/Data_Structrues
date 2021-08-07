package com.datastructures.linkedlist.doubly;

import com.datastructures.linkedlist.singly.Node;

public class DoublyLinkedList {

    public DoublyNode head;
    public void addAtHead(DoublyNode node)
    {
        if(head!=null)
        {
            node.next=head;
            head.previous=node;
        }
        head=node;
    }

    public void addAtTail(DoublyNode node)
    {
        DoublyNode tn=head;
        if(head==null)
        {
            head=node;
            return;
        }
        while(tn.next!=null)
            tn=tn.next;
        tn.next=node;
        node.previous=tn;
    }

    public void addAtNthPostion(int pos,DoublyNode node)
    {
        DoublyNode tn=head;
        int counter=1;
        if(pos==1) {
            this.addAtHead(node);
            return;
        }
        while(tn!=null)
        {
            if(counter==pos)
            {

                node.previous=tn.previous;
                tn.previous.next=node;
                node.next=tn;
                tn.previous=node;
            }
            tn=tn.next;
            counter++;
        }
    }

    public void travelFromHead()
    {
        DoublyNode travelNode=this.head;
        while(travelNode!=null)
        {
            System.out.println("The linked list elements are->"+travelNode.data);
            travelNode=travelNode.next;
        }
    }

    public void travelFromdNode(DoublyNode n)
    {
        DoublyNode travelNode=n;
        while(travelNode!=null)
        {
            System.out.println("The linked list elements are->"+travelNode.data);
            travelNode=travelNode.next;
        }
    }

    public DoublyNode ReverseADoublyLinkedList()
    {
        DoublyNode node=head;
        DoublyNode n=node;
        while(node!=null)
        {
            DoublyNode temp=node.previous;
            node.previous=node.next;
            node.next=temp;
            if(node.previous==null)
            {
                return  node;
            }
            node=node.previous;

        }
        return  null;

    }
}
