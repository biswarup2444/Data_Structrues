package com.datastructures;
import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.singly.Node;

public class Main {

    public static void main(String[] args) {
        LinkedListProblem1 l1=new LinkedListProblem1();
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.addAtTail(new DoublyNode(11));
        dl.addAtTail(new DoublyNode(10));
        dl.addAtTail(new DoublyNode(8));

        DoublyNode n=dl.head;

        n=l1.mergeSortDoublyLinkedList(n);
        l1.printAll(n);




    }
}
