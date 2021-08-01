package com.datastructures.linkedlist;
import com.datastructures.linkedlist.circular.SinglyCircularLinkedList;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.singly.*;
public class Main {

    public static void main(String[] args) {
        SinglyCircularLinkedList scl=new SinglyCircularLinkedList();
        Node n=new Node(10,new Node(20,new Node(30,new Node(40))));
        scl.head=n;
        scl.MakeCircularLinkedList(n);
        Node ne=new Node(50);
        //scl.insertAtNth(1,ne);

        scl.PrintList();

    }
}
