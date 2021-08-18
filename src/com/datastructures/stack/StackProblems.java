package com.datastructures.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Collections;

public class StackProblems {
    public int nearestGreatestToTheRight(int[] ar, int a) {

        Stack st = new Stack();
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == a) {
                break;
            }
            st.push(ar[i]);

        }

        int r = -1;

        while (!st.isEmpty()) {
            //System.out.println(st.peek());
            if (st.peek() > a) {
                r = st.peek();
                break;
            }
            st.pop();
        }
        return r;

    }
    public int nearestGreatestToTheLeft(int[] ar, int a) {

        Stack st = new Stack();
        for (int j : ar) {
            if (j == a) {
                break;
            }
            st.push(j);

        }
        //System.out.println(st.peek());
        int r =-1;

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            if (st.peek() >a) {
                r = st.peek();
                break;
            }
            st.pop();
        }
        return r;

    }
    public int nearestSmallestToTheLeft(int[] ar,int a) {
        Stack st=new Stack();
        for(int i:ar)
        {
            if(a==i)
                break;
            st.push(i);
        }

        int r=-1;
        while(!st.isEmpty())
        {
            if(a>st.peek())
            {
                r=st.peek();
                break;
            }
            st.pop();
        }
        return r;
    }
    public int nearestSmallestToTheRight(int[] ar,int a) {
        Stack st=new Stack();
        for(int i=ar.length-1;i>0;i--)
        {
            if(ar[i]==a)
                break;
            st.push(ar[i]);
        }

        int r=-1;
        while(!st.isEmpty())
        {
            if(a>st.peek())
            {
                r=st.peek();
                break;
            }
            st.pop();
        }
        return r;
    }
    public ArrayList<Integer> nearestGreatestToTheRight(int[] ar) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack st=new Stack();
        for (int i = ar.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                al.add(-1);
                st.push(ar[i]);
            } else if (st.peek() > ar[i]) {
                al.add(st.peek());
            } else if (st.peek() < ar[i])
            {
                while (!st.isEmpty()&& st.peek()<ar[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                    al.add(-1);
                else
                    al.add(st.peek());
                st.push(ar[i]);
            }
        }
        Collections.reverse(al);
        return al;
    }
    public ArrayList<Integer> nearestGreatestToTheLeft(int[] ar) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack st=new Stack();
        for (int j : ar) {
            if (st.isEmpty()) {
                al.add(-1);
                st.push(j);
            } else if (st.peek() > j) {
                al.add(st.peek());
                st.push(j);
            } else if (st.peek() < j) {
                while (!st.isEmpty() && st.peek() < j) {
                    st.pop();
                }
                if (st.isEmpty())
                    al.add(-1);
                else
                    al.add(st.peek());
                st.push(j);
            }
        }
        //Collections.reverse(al);
        return al;
    }
    public ArrayList<Integer> nearestSmallestToTheLeft(int[] ar) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        Stack st=new Stack();
        for(int i:ar)
        {
            if(st.isEmpty())
            {
                a.add(-1);
                st.push(i);
            }
            else if(i>=st.peek())
            {

                a.add(st.peek());
            }
            else if(i<st.peek())
            {
                while(!st.isEmpty() && i<=st.peek())
                {
                    st.pop();
                }
                if(st.isEmpty())
                    a.add(-1);
                else
                    a.add(st.peek());
                st.push(i);
            }
        }
        return a;
    }
    public ArrayList<Integer> nearestSmallestToTheRight(int[] ar) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        Stack st=new Stack();
        for(int i=ar.length-1;i>0;i--)
        {
            if(st.isEmpty())
            {
                a.add(-1);
                st.push(ar[i]);
            }
            else if(ar[i]>=st.peek())
            {

                a.add(st.peek());
            }
            else if(ar[i]<st.peek())
            {
                while(!st.isEmpty() && st.peek()>=i)
                {
                    st.pop();
                }
                if(st.isEmpty())
                    a.add(-1);
                if(st.peek()<i)
                {
                    a.add(ar[i]);
                }
                st.push(ar[i]);
            }
        }
        Collections.reverse(a);
        return a;
    }
    public long getMaxArea(long[] hist, long n) {
        // your code here
        ArrayList<Long> a1 = nearestSmallestToTheLeftIndex(hist,n);
        ArrayList<Long> a2 = nearestSmallestToTheRightIndex(hist,n);

        long max=Long.MIN_VALUE;

        for (int i = 0; i<n; i++)
        {

            long v=Math.abs(a2.get(i)-a1.get(i)-1);
            max=Math.max(max,v*hist[i]);
        }
        return max;
    }
    public  ArrayList<Long> nearestSmallestToTheLeftIndex(long[] ar,long n) {
        ArrayList<Long> a = new ArrayList<Long>();
        Stack st=new Stack();

        for (int i = 0; i < n; i++)
        {
            if(st.isEmpty())
                a.add((long)-1);
            else if(ar[st.peek()]<ar[i])
            {
                a.add((long)st.peek());
            }
            else if(ar[st.peek()]>=ar[i])
            {
                while(!st.isEmpty() && ar[st.peek()]>=ar[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                    a.add((long)-1);
                else
                    a.add((long)st.peek());
            }
            st.push(i);
        }
        return a;
    }
    public  ArrayList<Long> nearestSmallestToTheRightIndex(long[] ar,long n) {
        ArrayList<Long> a = new ArrayList<Long>();
        Stack st=new Stack();

        for (int i =(int) n-1; i >=0 ; i--)
        {
            if(st.isEmpty())
                a.add((long)n);
            else if(ar[st.peek()]<ar[i])
            {
                a.add((long)st.peek());
            }
            else if(ar[st.peek()]>=ar[i])
            {
                while(!st.isEmpty() && ar[st.peek()]>=ar[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                    a.add((long)n);
                else
                    a.add((long)st.peek());
            }
            st.push(i);
        }

        Collections.reverse(a);
        return a;
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<m;i++)
        {
            ar.add(M[0][i]);
        }
        int ma=maxHist(ar,ar.size());

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(M[i][j]==0)
                    ar.set(j,0);
                else
                    ar.set(j,ar.get(j)+1);
            }

            ma=Math.max(ma,maxHist(ar,ar.size()));

        }
        return ma;
    }
    public int maxHist(ArrayList<Integer> ar,int n) {
        int i=0;
        Stack st=new Stack();
        int area=0;
        int max=Integer.MIN_VALUE;

        while(i<n)
        {
            if(st.isEmpty()|| ar.get(st.peek()) < ar.get(i))
                st.push(i++);
            else
            {
                int top=st.pop();
                if(st.isEmpty())
                    area=ar.get(top)*i;
                else
                    area=ar.get(top)*(i-1-st.peek());
                max=Math.max(max,area);
            }
        }
        while(!st.isEmpty())
        {
            int top=st.pop();
            if(st.isEmpty())
                area=ar.get(top)*i;
            else
                area=ar.get(top)*(i-1-st.peek());
            max=Math.max(max,area);
        }
        return max;
    }

}
