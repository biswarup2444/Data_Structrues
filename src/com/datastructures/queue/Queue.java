package com.datastructures.queue;

public class Queue {
    int start=-1;
    int end=-1;
    final int MAX=1000;
    int[] arr=new int[MAX];
    public int dequeue()
    {
        if(isEmpty())
            return 0;
        return arr[start++];

    }
    public int size()
    {
        if(isEmpty())
            return 0;
        return end-start+1;
    }
    public void peek()
    {
        System.out.println(arr[start]);
    }

    public void enqueue(int x)
    {
        if(isFull()) {
            System.out.println("queue is full");
            return;
        }
        if(isEmpty()){
            start=0;

        }
        end++;
        arr[end]=x;
    }

    public boolean isEmpty()
    {
        return start == -1 && end == -1;
    }

    public  boolean isFull()
    {
        return end==MAX;
    }
}
