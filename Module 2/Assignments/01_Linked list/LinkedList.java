import java.util.*;
import java.io.*;


class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
    this.next=null;
  }
}

class LinkedList{
  Node head;
  void add(int val){
    Node newNode=new Node(val);
    newNode.next=head;
    head=newNode;
  }

  void display(){
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.val+" ");
      curr=curr.next;
    }
  }

  
}



public class Main{

    public static Node reverse(Node head){
      Node curr=head;
      Node prev=null;
      Node next=null;

      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      }
      return prev;
    }


  public static void combine(Node head, LinkedList list){
        int carry = 1;
        while(head != null){
        int ans = head.val + carry;
         carry=ans/10;
         ans=ans%10;
        list.add(ans);
        head = head.next;
       
        }

        if(carry==1)
        list.add(1);
    }

  
  
  
    public static void main(String args[]) {

      Scanner sc=new Scanner(System.in);
      LinkedList list=new LinkedList();
      int x=sc.nextInt();
      int temp=0;

      // 456
      while(x!=0){
        temp=x%10;
        list.add(temp);
        x=x/10;
        
      }
     

      // 4->5->6->null

      list.head=reverse(list.head);
      

      
      // 6->5->4->null

      LinkedList ans=new LinkedList();
      combine(list.head,ans);
      

      
      // // 4->5->7->null

      ans.display();
    

      
    }
}




