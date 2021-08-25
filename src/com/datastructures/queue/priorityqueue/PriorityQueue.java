package com.datastructures.queue.priorityqueue;
//assuming priority can not be negative
public class PriorityQueue {

    QueueObject[] qr=null;
    int start=-1;
    QueueObject max=null;
    public PriorityQueue(int n)//O(1)
    {
        qr=new QueueObject[n];
    }
    public void enQueue(int val,int priority)//O(1)
    {
        QueueObject n=new QueueObject(val,priority);
        this.start++;
        qr[this.start]=n;

        if(max==null || n.priority> max.priority)
            max=n;
    }

    public int getHighestPriority() //O(1)
    {
        if(max==null)
            return -1;
        return max.priority;
    }

    public int deQueueHighestPriority()//O(n)
    {
        if(max==null)
            return -1;
        int r=max.val;

        boolean flag=false;
        for(int i=0;i<this.start;i++)
        {
            if(max==qr[i])
                flag=true;
            if(flag)
                qr[i]=qr[i+1];

        }
        qr[this.start]=null;
        this.start--;

        max=qr[0];
        for(int i=0;i<=this.start;i++)
        {
            if (qr[i].priority> max.priority)
                max=qr[i];
        }
        return r;
    }
}

