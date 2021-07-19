package com.datastructures.linkedlist;
import com.datastructures.linkedlist.singly.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        SinglyLinkedList sl=new SinglyLinkedList();

        sl.addAtHead(new Node(30));
        sl.addAtHead(new Node(20));
        sl.addAtHead(new Node(10));
        sl.addAtHead(new Node(40));
        sl.addAtTail(new Node(50));
        sl.addAtTail(new Node(60));
        sl.addInNthPosition(new Node(70),1);
        System.out.println("The size of the linked list ->" + sl.size());
        sl.travelFromHead();
        sl.deleteNodeFromNthPosition(2);
        System.out.println("The size of the linked list ->" + sl.size());
        sl.travelFromHead();
    }
}
