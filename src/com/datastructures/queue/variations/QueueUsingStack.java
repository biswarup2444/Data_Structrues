package com.datastructures.queue.variations;

import java.util.Stack;

public class QueueUsingStack {

    public Stack<Integer> st=new Stack<>();

    public boolean isEmpty()
    {
        return st.isEmpty();
    }

    public void enQueue(int x)
    {
        st.push(x);
    }

    public  int  deQueue(Stack<Integer> st)
    {
        if(st.size()==1)
            return st.pop();
        int i=st.pop();
        int r=deQueue(st);
        st.push(i);
        return r;
    }
}
