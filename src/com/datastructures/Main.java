package com.datastructures;
import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.problems.NodeOfPoly;
import com.datastructures.linkedlist.singly.Node;
import com.datastructures.linkedlist.singly.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListProblem1 l1=new LinkedListProblem1();

        NodeOfPoly n=new NodeOfPoly(3,2);

        NodeOfPoly n2=new NodeOfPoly(3,3);
        n2.next=new NodeOfPoly(1,2);
        n2.next.next=new NodeOfPoly(2,1);



        l1.printAll(l1.addPolyNominalLessSpace(n,n2));



    }
}
