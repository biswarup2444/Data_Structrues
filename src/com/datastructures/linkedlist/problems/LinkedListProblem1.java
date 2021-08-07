package com.datastructures.linkedlist.problems;

import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.singly.Node;

public class LinkedListProblem1 {

    public void changeLinkedListOrder(Node head) {
        Node newNode = null;
        int range_end = size(head);
        Node tail = tailNode(head);
        //System.out.println(tail.data);
        Node prev = head;
        head = head.next;

        for (int i = 0; i < range_end / 2; i++) {
            prev.next = head.next;
            tail.next = head;
            tail = tail.next;

            prev = prev.next;
            head = prev.next;


        }

        tail.next = null;

    }

    public void removeLoop(Node head) {
        if (head == null)
            System.exit(1);
        Node slow = head;
        Node fast = head;
        Node last = head;
        //Node slow and fast catch up only if there is a loop
        while (fast.next != null) {
            fast = fast.next.next;

            slow = slow.next;
            if (fast == slow)
                break;
        }
        if (last == slow) {
            slow.next = null;
            return;
        }
        // slow and last will match at the starting of the loop
        //It is to note due to the nature of the loop fast and slow will match exactly
        //at the point the from the start of the having the same number of elements from the head of the ll
        //meaning if the loop starts and nth node from the head slow and last will also match at nth elements away
        //from the starting of the loop
        while (last.next != slow.next) {

            last = last.next;
            slow = slow.next;
        }
        slow.next = null;

    }

    public Node tailNode(Node head) {
        while (head.next != null) {
            head = head.next;

        }
        return head;
    }

    public int size(Node head) {
        int counter = 0;
        while (head != null) {
            head = head.next;
            counter++;
        }
        return counter;
    }

    public void printAll(Node n) {
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void printAll(DoublyNode n) {
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
    public void merge(int[] l, int[] r, int[] A) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                A[k] = l[i];
                i++;
            } else {
                A[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length) {
            A[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            A[k] = r[j];
            j++;
            k++;
        }
    }

    public void mergeSortArray(int[] A) {
        int len = A.length;
        if (len < 2)
            return;
        int[] l = new int[len / 2];
        int[] r = new int[len - len / 2];
        for (int i = 0; i < len / 2; i++) {
            l[i] = A[i];
        }
        for (int j = 0; j < len - len / 2; j++) {
            r[j] = A[len / 2 + j];
        }
        mergeSortArray(l);
        mergeSortArray(r);
        merge(l, r, A);
    }

    public Node mergeSortLinkedList(Node A) {
        if (A.next == null )
            return A;
        int size=this.size(A);

        Node l=A;
        Node r=null;
        Node head=A;
        for(int i=0;i<size/2-1;i++)
        {
            head=head.next;
        }
        r=head.next;
        head.next=null;
        Node cr=r;
        Node cl=l;
        l= mergeSortLinkedList(l);
        r= mergeSortLinkedList(r);

        return  merge(l,r);

    }
    public Node merge(Node l, Node r)
    {
        Node A=null;
        Node head=null;
        if(l==null)
           return  r;
       if(r==null)
           return l;
        while(l!=null && r!=null)
        {
            if(l.data<r.data)
            {
                if(A==null)
                {    A=l;
                    head=A;
                }
                else {
                    A.next = l;
                    A=A.next;
                }
                l=l.next;
            }
            else
            {
                if(A==null)
                {    A=r;
                    head=A;
                }
                else {
                    A.next = r;
                    A=A.next;
                }
                r=r.next;
            }

        }
        if(l!=null)
            A.next=l;
        if(r!=null)
            A.next=r;
        return head;
    }
    public Node mergeSortGfg(Node n)
    {
        if(n==null || n.next==null)
            return n;
        Node l=n;
        Node middle=getMiddle(n);
        Node r=middle.next;
        middle.next=null;
        l=mergeSortGfg(l);
        r=mergeSortGfg(r);
        return mergerGfg(l,r);

    }

    public Node mergerGfg(Node l,Node r)
    {
        Node res=null;
        if(l==null)
            return r;
        if(r==null)
            return l;
        if(l.data<r.data)
        {
            res=l;
            res.next=mergerGfg(l.next,r);
        }
        else
        {
            res=r;
            res.next=mergerGfg(l,r.next);
        }
        return  res;
    }

    public Node getMiddle(Node n)
    {
        Node slow=n;
        Node fast=n;
        while(fast!=null )
        {
            fast=fast.next;
            if(fast.next==null)
                return slow;
            fast=fast.next;
            slow=slow.next;
        }
        return  slow;
    }


    public DoublyNode getMiddle(DoublyNode n)
    {
        DoublyNode slow=n;
        DoublyNode fast=n;
        while(fast!=null)
        {
            fast=fast.next;
            if(fast==null)
            {
                return  slow;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public DoublyNode mergeSortDoublyLinkedList(DoublyNode n)
    {
        if(n==null || n.next==null)
            return n;
        DoublyNode l;
        DoublyNode r;
        l=n;
        DoublyNode middle=getMiddle(n);
        r=middle.next;
        System.out.println(r.data);

        middle.next=null;
        l=mergeSortDoublyLinkedList(l);
        r=mergeSortDoublyLinkedList(r);
        return  merger(l,r);

    }

    public DoublyNode merger(DoublyNode l,DoublyNode r)
    {
        if(l==null)
            return r;
        if(r==null)
            return l;
        DoublyNode res;
        if(l.data<r.data)
        {
            res=l;
            DoublyNode ret=merger(l.next,r);
            ret.previous=res;
            res.next=ret;
            res.previous=null;

        }
        else
        {
            res=r;
            DoublyNode ret=merger(l,r.next);
            ret.previous=res;
            res.next=ret;
            res.previous=null;
        }
        return res;
    }
    

}

