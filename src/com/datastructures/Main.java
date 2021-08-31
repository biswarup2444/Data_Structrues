package com.datastructures;
import com.datastructures.queue.priorityqueue.PriorityQueueUsingLinkedList;
import com.datastructures.queue.variations.CircularQueue;
import com.datastructures.queue.variations.CircularQueueUsingLinkedList;
import com.datastructures.queue.variations.Dequeue;
import com.datastructures.queue.variations.StackUsingQueue;
import com.datastructures.tree.BinarySearchTree;
import com.datastructures.tree.TreeNode;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree bst=new BinarySearchTree();
        TreeNode t=null;
        System.out.println(bst.isEmpty(t));
        t=bst.insert(t,10);
        t=bst.insert(t,20);
        t=bst.insert(t,5);
        t=bst.insert(t,4);
        t=bst.insert(t,15);
        System.out.println(bst.isEmpty(t));
        System.out.println(t.right.left.data);
        System.out.println(t.right.data);
        System.out.println(t.data);
        System.out.println(t.left.data);
        System.out.println(t.left.left.data);
        //System.out.println(t.right.data);
    }
}
