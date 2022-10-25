import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList{
  Node head;
  public void add(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    Node cur=head;
    while(cur.next!=null){
      cur=cur.next;
    }
    cur.next=newnode;
  }

  public void insertAtStart(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    newnode.next=head;
    head=newnode;
  }
  public void printList(){
    if(head==null){
      return;
    }
    Node iter=head;
    while(iter!=null){
      System.out.print(iter.data+" ");
      iter=iter.next;
    }
    System.out.println();
  }
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner s=new Scanner(System.in);
      LinkedList l1=new LinkedList();
       LinkedList l2=new LinkedList();
      LinkedList l3=new LinkedList();
      int n=s.nextInt();
      for(int i=0;i<n;i++){
        int data=s.nextInt();
        l1.add(data);
      }
      //Node head=l1.head;
      Node odd=l1.head;
      Node even=l1.head.next;
      int oddValue,evenValue;
      while(odd!=null){
        oddValue=odd.data;
        l2.add(oddValue);
        odd=odd.next.next;
        evenValue=even.data;
        l3.insertAtStart(evenValue);
        even=even.next.next;
      }
      System.out.println("First list...");
      l1.printList();
      System.out.println("Second  list...");
      l2.printList();
      System.out.println("Third list...");
      l3.printList();
    //   Node hd=l2.head;
    //   Node iter=hd;
    //   Node hd1=l3.head;
    //   while(iter.next!=null){
    //     iter=iter.next;
    //   }
    //   iter.next=hd1;
    //   l2.printList();
    }
}