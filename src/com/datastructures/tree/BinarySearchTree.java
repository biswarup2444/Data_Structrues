package com.datastructures.tree;

public class BinarySearchTree {


    public boolean isEmpty(TreeNode root)
    {
        return root==null;
    }
    public TreeNode insert(TreeNode r,int n) {
        if (r == null)
        {
            r=new TreeNode(n);

        }
        else if(r.data>n)
        {

            r.left=insert(r.left,n);
        }
        else
        {
            r.right=insert(r.right,n);
        }
        return r;
    }
}
