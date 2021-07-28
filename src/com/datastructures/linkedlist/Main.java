package com.datastructures.linkedlist;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.singly.*;
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sl=new SinglyLinkedList();
        LinkedListProblem1 l1=new LinkedListProblem1();
//        sl.addAtHead(new Node(30));
//        sl.addAtHead(new Node(20));
//        sl.addAtHead(new Node(10));
//        sl.addAtHead(new Node(40));
//        sl.addAtTail(new Node(50));
//        sl.addAtTail(new Node(60));
//        sl.addInNthPosition(new Node(70),1);
        //System.out.println("The size of the linked list ->" + sl.size());
        //sl.travelFromHead();
        //sl.deleteNodeFromNthPosition(2);
        //sl.reverseLinkedList();
        //sl.deleteNodeFromValue(10);
        Node n=new Node(10,new Node(20,new Node(30,new Node(40))));
        //sl.deleteTail(n);
        //l1.changeLinkedListOrder(n);
        //l1.printAll(n);
        //System.out.println();
        //System.out.println("The size of the linked list ->" + sl.size());
        //sl.travelFromNode(n);
    }
}
