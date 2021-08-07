package com.datastructures;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.singly.Node;

public class Main {

    public static void main(String[] args) {
        LinkedListProblem1 l1=new LinkedListProblem1();
        Node n=new Node(5,new Node(3,new Node(7,new Node(7))));
        n=l1.mergeSortGfg(n);
        l1.printAll(n);





    }
}
