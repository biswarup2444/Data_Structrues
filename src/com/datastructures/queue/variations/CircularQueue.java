package com.datastructures.queue.variations;

public class CircularQueue {
    int MAX=5;
    int[] ar;
    int front=-1;
    int end=-1;
    public CircularQueue()
    {
        ar=new int[MAX];
    }

    public boolean isEmpty()
    {
        return front==-1&&end==-1;
    }

    public boolean isFull()
    {

        return (front-1==end)||(front==0 && end==MAX-1);
    }

    public  void enQueue(int x)
    {
        if(isFull())
        {
            System.out.println("full");
            return;
        }
        if(isEmpty())
        {
            front=end=0;
        }
        else if(end>=MAX-1)
            end=0;
        else
            end=end+1;
        ar[end]=x;
    }

    public  int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            System.exit(0);
        }


        int v=ar[front];
        ar[front]=0;
        front++;
        if(front>=MAX)
            front=0;
        else if(front==end+1)
        {
            front=end=-1;
        }


        return v;
    }



}
