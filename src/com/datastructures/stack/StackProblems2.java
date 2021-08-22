package com.datastructures.stack;

import  java.util.Stack;

public class StackProblems2 {
    public int precedance(char i) {
        int r = -1;

        if (i == '^')
            r = 3;
        else if (i == '*' || i == '/')
            r = 2;
        else if (i == '+' || i == '-')
            r = 1;
        return r;
    }

    public boolean isOperator(char ch)
    {

        return  ((ch >='A' && ch<='Z')||(ch >='a' && ch<='z') || Character.isDigit(ch));

    }

    public String infixToPostfix(String exp) {

        StringBuilder op = new StringBuilder();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c))
                op.append(c);
            else {
                if (st.isEmpty() || (this.precedance(st.peek()) < this.precedance(c)) || c == '(')
                    st.push(c);
                else if (c == ')') {
                    while (!st.isEmpty() && st.peek() != '(')
                        op.append(st.pop());
                    st.pop();
                } else {
                    while (!st.isEmpty() && this.precedance(st.peek()) >= this.precedance(c))
                        op.append(st.pop());
                    st.push(c);
                }
            }


        }
        while (!st.isEmpty())
            op.append(st.pop());
        return op.toString();
    }

    public String infixToPrefix(String exp)
    {


        StringBuffer s=new StringBuffer(exp);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
                s.setCharAt(i,'(');
            else if(s.charAt(i)=='(')
                s.setCharAt(i,')');
        }
        exp=s.reverse().toString();

        s=new StringBuffer(this.infixToPostfix(exp));
        return s.reverse().toString();

    }

    public String postfixToInfix(String exp)
    {
        Stack<String> st=new Stack<String>();

        for(int i=0;i<exp.length();i++)
        {
            String s="";

            if(!isOperator(exp.charAt(i)))
            {
                String a=st.pop();
                String b=st.pop();
                s="("+a+exp.charAt(i)+b+")";

            }
            else
            {
                s=""+exp.charAt(i);
            }
            st.push(s);

        }

        StringBuffer c=new StringBuffer(st.peek());
        for(int i=0;i<c.length();i++)
        {
            if(c.charAt(i)==')')
                c.setCharAt(i,'(');
            else if(c.charAt(i)=='(')
                c.setCharAt(i,')');
        }
        return c.reverse().toString();


    }
    public String prefixToInfix(String exp)
    {
        Stack<String> st=new Stack<String>();
        exp=new StringBuffer(exp).reverse().toString();
        for(int i=0;i<exp.length();i++)
        {
            String s="";

            if(!isOperator(exp.charAt(i)))
            {
                String a=st.pop();
                String b=st.pop();
                s="("+a+exp.charAt(i)+b+")";

            }
            else
            {
                s=""+exp.charAt(i);
            }
            st.push(s);

        }

        return st.peek();


    }
}
