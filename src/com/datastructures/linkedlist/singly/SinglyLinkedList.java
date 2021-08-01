package com.datastructures.linkedlist.singly;

public class SinglyLinkedList {

   private Node head;



   public void addAtHead(Node node)
   {
      if(head!=null)
      {
         node.next=head;
      }
      head=node;
   }

   public void addAtTail(Node node)
   {
      Node travelNode=this.head;
      while(travelNode.next!=null)
      {
         travelNode=travelNode.next;
      }
      travelNode.next=node;

   }

   public int size()
   {
      Node travelNode = head;
      int size=0;
      while (travelNode != null)
      {
         size++;
         travelNode=travelNode.next;
      }
      return size;
   }

   public void addInNthPosition(Node node,int n)
   {
      if(n>=this.size())
      {
         //System.out.println("Entering the element at the tail of the list as the position mentioned here is more than the number of elements in the list");
         this.addAtTail(node);
         return;
      }
      else if(n==0)
      {
         this.addAtHead(node);
         return;
      }
      Node travelNode=head;
      int counter=1;
      while(travelNode!=null)
      {
         if(n==counter)
         {
            node.next=travelNode.next;
            travelNode.next=node;
            return;
         }
         travelNode=travelNode.next;
         counter++;
      }
   }
   public void travelFromHead()
   {
      Node travelNode=this.head;
      while(travelNode!=null)
      {
         System.out.println("The linked list elements are->"+travelNode.data);
         travelNode=travelNode.next;
      }
   }

   public void travelFromNode(Node n) {
      while(n != null)
      {
         System.out.println("data ->\t"+n.data);
         n=n.next;
      }
   }

   public void deleteNodeFromHead()
   {
      Node travelNode=head;
      head=travelNode.next;
      travelNode.next=null;
   }

   public void deleteNodeFromTail()
   {
      int size=this.size();
      Node travelNode=head;
      int counter=1;
      while(counter<size-1)
      {
         travelNode=travelNode.next;
         counter++;
      }
      travelNode.next=null;
   }

   public void deleteTail(Node n)
   {
      while(n!=null) {
         if (n.next.next == null)
         {
            n.next=null;
            return;
         }
         n=n.next;
      }

   }

   public void deleteNodeFromNthPosition(int n)
   {

      Node travellingNode=head;
      int counter=1;
      while(travellingNode!=null)
      {
         if(n-1==counter)
         {
            travellingNode.next=travellingNode.next.next;
            break;
         }
         counter++;
         travellingNode=travellingNode.next;
      }
   }

   public void deleteNodeFromValue(int n)
   {
      Node travellingNode=this.head;
      Node prev=null;
      while(travellingNode!=null)
      {
         if(travellingNode.data==n )
         {
            if(prev!=null)
            {
               prev.next=travellingNode.next;
            }
            else
            {
               head=travellingNode.next;
               return;
            }
         }
         prev=travellingNode;
         travellingNode=travellingNode.next;
      }
   }

   public void reverseLinkedList()
   {
      Node travellingNode=head;
      Node previous = null;
      Node next=null;
      while(travellingNode!=null)
      {
         next= travellingNode.next;
         travellingNode.next=previous;
         previous=travellingNode;
         travellingNode=next;

      }
      head=previous;
   }

   public Node searchAnElementRercusion(Node head,int x)
   {

      if(head.data==x)
         return head;
      else
         return searchAnElementRercusion(head.next,x);
   }
   public Node SwapNodesBasedOnValue(Node n,int x,int y)
   {
      //Node h=n;
      if(x==y)
         return n;
      Node prevX=null;
      Node currX=n;
      while(currX!=null && currX.data!=x)
      {
         prevX=currX;
         currX= currX.next;
      }

      Node prevY=null;
      Node currY=n;
      while(currY!=null &&  currY.data!=y)
      {
         prevY=currY;
         currY=currY.next;
      }
      if(currX==null || currY==null)
         return n;
      if(prevX==null)
         n=currY;
      else
         prevX.next=currY;
      if(prevY==null)
         n=currX;
      else
         prevY.next=currX;

      Node temp=currX.next;
      currX.next=currY.next;
      currY.next=temp;


      return  n;
   }
   public void sort()
   {
      
   }

}
