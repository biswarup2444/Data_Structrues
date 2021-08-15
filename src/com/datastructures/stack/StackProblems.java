package com.datastructures.stack;

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
}
