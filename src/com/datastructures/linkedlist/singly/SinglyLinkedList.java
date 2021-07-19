package com.datastructures.linkedlist.singly;

public class SinglyLinkedList {

   Node head;

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

   public void deleteNodeFromNthPosition(int n)
   {

      Node travellingNode=head;
      int counter=1;
      while(travellingNode!=null)
      {
         if(n-1==counter)
         {
            travellingNode=travellingNode.next.next;
            break;
         }
         counter++;
         travellingNode=travellingNode.next;
      }
   }

   public void sort()
   {
      Node dummyHead=head;
      Node sortedHead=null;
      while(dummyHead!=null)
      {
         Node travellingNode=dummyHead;
         int val=travellingNode.data;
         while(travellingNode!=null)
         {
            if(travellingNode.data<val){
               val=dummyHead.data;

            }
            travellingNode=travellingNode.next;
         }
         Node n=new Node(val);
         if(sortedHead==null)
         {
            sortedHead=n;
         }
         else {
            Node travellingSortedNode = sortedHead;
            while (travellingSortedNode.next != null)
            {

            }
            travellingSortedNode.next=n;
         }

      }
   }

}
