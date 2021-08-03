package com.datastructures;

import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.DoublyNode;
import com.datastructures.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack sc=new Stack();
        System.out.println("Stack Empty?\t"+sc.isEmpty());
        sc.push(1);
        sc.push(3);
        sc.push(5);
        sc.push(7);
        sc.push(9);
        System.out.println(sc.isEmpty());
        sc.makeEmpty();
        System.out.println(sc.isEmpty());


    }
}
