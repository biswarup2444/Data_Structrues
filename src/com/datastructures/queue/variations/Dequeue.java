package com.datastructures.queue.variations;

public class Dequeue {
    int[] arr;
    int MAX=100;
    int front=-1;
    int rear=0;
    public  Dequeue()
    {
        arr=new int[MAX];
    }

    public boolean isEmpty()
    {
        return front==-1 || front==rear;
    }

    public boolean isFull()
    {
        return (front==0&&rear==MAX-1)||front==rear+1;
    }

    public void insertAtFront(int i)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(front==-1)
        {
            front=rear=0;
        }
        else if(front==0)
            front=MAX-1;
        else
            front=front-1;
        arr[front]=i;
    }

    public void insertAtRear(int i)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty())
            front=rear=0;
        else if(rear==MAX-1)
            rear=0;
        else
            rear=rear+1;
        arr[rear]=i;
    }

    public  int deleteRear()
    {
        int val=-1;
        val=arr[rear];
        arr[rear]=0;
        rear--;
        if(rear<0)
            rear=MAX-1;
        else if(rear==front)
        {    front=-1;
            rear=0;
        }
        return val;

    }
    public int deleteFront()
    {
        int val=arr[front];
        arr[front]=0;
        front++;
        if(front>=MAX)
            front=0;
        else if(rear==front)
        {
            front=-1;
            rear=0;
        }
        return val;
    }

    public void printAll()
    {
        int i=front;
        while(true)
        {
            if(i-1==rear)
                break;
            if(i>=100)
                i=i%100;
            System.out.println(arr[i]);
            i++;

        }
    }
}
