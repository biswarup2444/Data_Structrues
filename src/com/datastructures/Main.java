package com.datastructures;

import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.queue.Queue;
import com.datastructures.queue.QueueLinkedList;
import com.datastructures.stack.Stack;

public class Main {

    public static void main(String[] args) {
        QueueLinkedList q=new QueueLinkedList();
        q.enqeue(1);
        q.enqeue(2);
        q.enqeue(3);
        q.enqeue(4);
        q.enqeue(5);

        System.out.println("dq->"+q.head.data);




    }
}
