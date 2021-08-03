package com.datastructures.stack;

public class Stack {
    final int SIZE=1000;
    int top;
    int[] arr=new int[SIZE];
    public Stack()
    {
        top=-1;
    }

    public void makeEmpty()
    {
        while(this.top!=-1)
        {
            System.out.println(this.pop());
        }
    }

    public void push(int data)
    {
        if(top>=SIZE-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=data;

    }

    public int pop()
    {
        int r=0;
        if(isEmpty())
            System.out.println("Empty");
        else
        {
            r= arr[top];
            arr[top]=0;
            top--;
        }
        return  r;
    }

    public void peek()
    {
        int r;
        if(isEmpty())
        {
            System.out.println("Empty");
            return ;
        }
        System.out.println("top->\t"+arr[top]);

    }

    

    public boolean isEmpty()
    {
        return top == -1;
    }
}
