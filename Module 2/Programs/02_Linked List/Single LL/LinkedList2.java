import java.util.*;
class LinkedList2{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    //Insert at first position
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    //Insert after given position
    public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
        
    }
    //Insert at the end
    public void  append(int new_data){
        if(head==null){
            head=new Node(new_data);
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
    }
    //Delete the first node
    public void delAtbeg(){
        if(head==null){
            System.out.println("There is nothing to delete");
            return;
        }
        Node temp=head;
        head=head.next;
        temp=null;
        

    }
    //Delete the last node
    public void delAtEnd(){
        if(head==null){
            System.out.println("There is nothing to delete");
            return;
        }
        Node t=head;
        Node prev=t;
        while(t.next!=null){
            prev=t;
            t=t.next;
        }
        prev.next=null;
        t=null;
       // System.out.println(t.data);

    }
    //Delete at given position
    public boolean delAtpos(int pos){
       // System.out.println(pos);
        if(head==null){
            System.out.println("There is nothing to delete");
            return false;
        }
        int count=-1;
        Node iterate=head;
        while (iterate!=null) {
            iterate=iterate.next;
            count++;

        }
        if(pos<0 ||pos>count){
            System.out.println("Invalid position");
            return false;
        }
        iterate=head;
        if(pos==0){
            head=head.next;
            iterate=null;
            return true;
        }
        //iterate=head;
        Node prev=head;
        int start=0;
        while (start<pos) {
            prev=iterate;
            iterate=iterate.next;
            start++;
        }
        System.out.println("Previous :"+prev.data);
        System.out.println("Iterate :"+iterate.data);
        prev.next=iterate.next;
       iterate=null;
        return true;

    }
    //Print the data of nodes
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.println(tnode.data);
            tnode=tnode.next;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        LinkedList2 l1=new LinkedList2();
        l1.head=new Node(5);
        l1.push(4);
        l1.push(3);
        l1.printList();
        //l1.delAtEnd();
        //System.out.println("After deletion of Last node");
        System.out.println("Enter the position to delete node :");
        int pos=s.nextInt();

        boolean result=l1.delAtpos(pos);
        if(result==true){
            System.out.println("After deletion of node at given position");
            l1.printList();
        }
        

        s.close();
        
    }
}