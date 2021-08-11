package com.datastructures.linkedlist.problems;

import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.singly.Node;

import java.util.HashSet;
import java.util.Set;

public class LinkedListProblem1 {

    public Node head;

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

    public void printAll(NodeOfPoly n)
    {

        while (n.next != null) {
            String s="";
            if(n.coeff!=1)
                s=n.coeff+"x^"+n.pow+"+";
            else
                s="x^"+n.pow+"+";
            System.out.print(s);
            n = n.next;
        }
        System.out.println(n.coeff+"x^"+n.pow);
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

    public Node merge(Node l, Node r) {
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
        while (fast.next != null && fast.next.next != null  ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        DoublyNode temp = slow.next;
        slow.next = null;
        return temp;
    }

    public DoublyNode mergeSortDoublyLinkedList(DoublyNode n)
    {
        if(n==null || n.next==null)
            return n;

        DoublyNode r=getMiddle(n);

        n=mergeSortDoublyLinkedList(n);
        r=mergeSortDoublyLinkedList(r);
        return  merger(n,r);

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
            l.next=merger(l.next,r);
            l.next.previous=l;
            l.previous=null;
            res=l;
        }
        else
        {
            r.next=merger(l,r.next);
            r.next.previous=r;
            r.previous=null;
            res=r;
        }
        return res;
    }

    public Node reverseRecursion(Node n)
    {
        if(n.next==null)
            return n;
        Node ne=null;
        ne=reverseRecursion(n.next);
        n.next.next=n;
        n.next=null;
        return ne;
    }

    public void reverseRecursionPrint(Node n)
    {
        if(n==null)
            return;

        reverseRecursionPrint(n.next);
        System.out.println(n.data);

    }

    public boolean isPalindrome(Node n)
    {
        Node header=n;
        Node ne=new Node(header.data);
        Node ref=ne;
        header=header.next;
        while(header!=null)
        {
            ne.next=new Node(header.data);
            header=header.next;
            ne=ne.next;
        }
        Node r=reverseLinkedList(n);
        while(ref!=null && r!=null)
        {
            if(r.data!=ref.data)
                return false;
            r=r.next;
            ref=ref.next;
        }
        return r == null && ref == null;
    }

    public Node reverseLinkedList(Node n)
    {
        Node prev=null;
        Node next=null;
        while(n!=null)
        {
            next=n.next;
            n.next=prev;
            prev=n;
            n=next;
        }
        return prev;
    }

    public boolean isPalindromeRecursive(Node n)
    {
        if(n==null)
            return true;
        boolean i=isPalindromeRecursive(n.next);
        //System.out.println(i);
        if(!i)
            return false;
        System.out.println(n.data+":\t:"+this.head.data);
        boolean r=false;
        if(n.data==this.head.data)
            r=true;
        this.head = this.head.next;
        return r;
    }

    public Node swapKthNodes(Node head,int num,int K)
    {

        int last=num+1-K;

        if(K>num || head==null ||head.next==null || K==last)
            return head;

        Node prev=null;
        Node prev2=null;
        Node n1=head;
        Node n2=head;

        for(int i=1;i<K;i++)
        {
            prev=n1;
            n1=n1.next;
        }
        for(int i=1;i<num+1-K;i++)
        {
            prev2=n2;
            n2=n2.next;
        }
        if(Math.abs(last-K)==1)
        {
            Node te1=n2.next;
            Node te2=n1.next;
            Node temp=n2;
            n2=n1;
            n1=temp;
            if(prev!=null) {
                prev.next = n1;
                n1.next=n2;
                n2.next=te1;
            }
            else if(prev==null) {
                head = n1;
                n1.next=n2;
                n2.next=te1;
            }
            else if(prev2!=null)
            {
                prev2.next=n2;
                n2.next=n1;
                n1.next=te2;
            }
            else
            {
                head = n2;
                n2.next=n1;
                n1.next=te2;
            }


        }
        else if(prev==null) {
            Node t = n1.next;
            Node te = n2.next;
            Node temp = n1;
            n1 = n2;
            n2 = temp;
            prev2.next = n2;
            n1.next = t;
            n2.next = te;
            head=n1;




        }
        else if(prev2==null)
        {
            Node t=n1.next;
            Node te=n2.next;
            Node temp=n1;
            n1=n2;
            n2=temp;
            prev.next=n1;
            n1.next=t;
            n2.next=te;
            head=n2;



        }
        else
        {
            Node t = n1.next;
            Node te = n2.next;
            Node temp = n1;
            n1 = n2;
            n2 = temp;
            prev2.next = n2;
            prev.next=n1;
            n1.next=t;
            n2.next=te;
        }

        return  head;
    }


    public int intersectPoint(Node head1, Node head2)
    {
        // code here
        Node tr=head1;
        int i=1;
        Node tr2=head2;
        int j=2;
        while(tr!=tr2)
        {


            if(tr==null)
            {
                if(i==1)
                {
                    tr=head2;
                    i=2;
                }
                else if(i==2)
                {
                    tr=head1;
                    i=1;
                }
            }
            else
            {
                tr=tr.next;
            }
            if(tr2==null)
            {
                if(j==1)
                {
                    tr2=head2;
                    j=2;
                }
                else if(j==2)
                {
                    tr2=head1;
                    j=1;
                }
            }
            else
            {
                tr2=tr2.next;
            }

        }
        return tr.data;
    }

    public int intersectPointBF(Node head1,Node head2)
    {

            int i=0;
            Set<Node> n=new HashSet<Node>();
            int s1=size(head1);
            int s2=size(head2);
            Node h1;
            Node h2;
            if(s1>=s2)
            {   h1=head1;h2=head2;}
            else
            {h1=head2;h2=head1;}
            while(h1!=null)
            {
                n.add(h1);
                h1=h1.next;
            }
            while(h2!=null)
            {
                if(n.contains(h2))
                    break;
                h2=h2.next;
            }
            return h2.data;
    }

    public Node rearrangeBF(Node n)
    {
        if(this.size(n)<3)
            return n;

        Node odd=n;
        Node even=n.next;
        int coutner=1;
        Node oddh=odd;
        Node evenh=even;
        Node tr=n.next.next;
        while(tr!=null)
        {
            if(coutner%2!=0)
            {
                odd.next=new Node(tr.data);
            }
            else
            {
                even.next=new Node(tr.data);
            }

            tr=tr.next;
            coutner++;
        }
        even.next=null;
        n=oddh;
        while(oddh.next!=null)
        {
            oddh=oddh.next;
        }
        oddh.next=evenh;


        return n;
    }

    public NodeOfPoly addPolyNominal(NodeOfPoly p1,NodeOfPoly p2)
    {
        NodeOfPoly t1=p1;
        NodeOfPoly t2=p2;
        NodeOfPoly p=null;
        NodeOfPoly head=null;
        while(t1!=null && t2!=null) {
            if (t1.pow == t2.pow) {
                    if(p==null) {
                        p = new NodeOfPoly(t1.coeff + t2.coeff, t1.pow);
                    }
                    else
                    {
                        p.next= new NodeOfPoly(t1.coeff + t2.coeff, t1.pow);
                    }

                t1=t1.next;
                t2=t2.next;
            } else if (t2.pow > t1.pow) {
                if(p==null) {
                    p = new NodeOfPoly(t2.coeff, t2.pow);
                }
                else
                {
                    p.next= new NodeOfPoly(t2.coeff, t2.pow);
                }
                t2=t2.next;
            } else {
                if(p==null) {
                    p = new NodeOfPoly(t1.coeff, t1.pow);
                }
                else
                {
                    p.next= new NodeOfPoly(t1.coeff, t1.pow);
                }
                t1=t1.next;
            }
            if(head==null) {
                head=p;

            }
            else
            {
                p=p.next;
            }

        }
        if(t2!=null)
        {
            p.next=t2;

        }
        else if(t1!=null)
        {
            p=t1;
        }
       return head;
    }

    public NodeOfPoly addPolyNominalLessSpace(NodeOfPoly p1,NodeOfPoly p2) {
        if (p1 == null && p2 == null)
            return null;
        else if (p1 == null)
            return p2;
        else if (p2 == null)
            return p1;
        if (p2.pow > p1.pow)
        {
            NodeOfPoly n=p2;
            p2=p1;
            p1=n;
        }

        NodeOfPoly head=p1;
        while(p1!=null && p2!=null)
        {

            if(p1.pow==p2.pow)
            {
                    p1.coeff=p1.coeff+p2.coeff;
                    //head.next=p1;
                    p1=p1.next;
                    p2=p2.next;
                    //head=head.next;
                    //head.next=null;
            }
            else if(p1.pow>p2.pow)
            {
                p1=p1.next;
            }
            else{
                NodeOfPoly temp=p2.next;
                NodeOfPoly temp2=p1.next;
                p1.next=p2;
                p2.next=temp2;

                p2=temp;
                p1=temp2;

            }

        }

        NodeOfPoly ref=head;
         if(p2!=null)
         {
            while(head.next!=null)
                head=head.next;
            head.next=p2;
        }

        return ref;
    }


}

