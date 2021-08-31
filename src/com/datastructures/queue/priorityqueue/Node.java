package com.datastructures.queue.priorityqueue;

public class Node {
    public int value;
    public int priority;
    public Node next;
    public  Node(){}
    public Node(int v,int p)
    {
        this.value=v;
        this.priority=p;
    }
}
