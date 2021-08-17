package com.datastructures;
import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.problems.NodeOfPoly;
import com.datastructures.linkedlist.singly.Node;
import com.datastructures.linkedlist.singly.SinglyLinkedList;
import com.datastructures.stack.StackProblems;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long ar[] = new long[]{};
        System.out.println(ar.length);
        StackProblems st = new StackProblems();

        System.out.println(st.getMaxArea(ar,ar.length));


    }
}
