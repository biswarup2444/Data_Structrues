package com.datastructures;
import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.linkedlist.problems.LinkedListProblem1;
import com.datastructures.linkedlist.problems.NodeOfPoly;
import com.datastructures.linkedlist.singly.Node;
import com.datastructures.linkedlist.singly.SinglyLinkedList;
import com.datastructures.queue.Queue;
import com.datastructures.stack.StackProblems2;
import com.datastructures.queue.QueueProblems;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Queue st=new Queue();
        QueueProblems qp=new QueueProblems();
        st.enqueue(1);
        st.enqueue(2);
        st.enqueue(3);
        st.enqueue(4);
        qp.reverseQueue(st);
        st.peek();




    }
}
