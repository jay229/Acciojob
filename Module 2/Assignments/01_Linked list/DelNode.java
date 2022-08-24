import java.util.*;
public class DelNode {
    Node head;
    static class Node {
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void append(int data) {
        if(head==null){
            head=new Node(data);
            return;
        }
        Node new_node=new Node(data);
        new_node.next=null;
        Node last=head;
        while (last.next!=null) {
            last=last.next;
        }
        last.next=new_node;

        
    }
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }
    public void delAtpos(int position) {
        if(head.next==null){
            head=null;
            return;
        }
        Node t=head;
        Node t1=head;
        int i=0,j=0;
        while(i<position){
            t=t.next;
            i++;
        }
        while(j<position-1){
            t1=t1.next;
            j++;
        }
        t1.next=t.next;

        //System.out.print(t.data);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        DelNode d1=new DelNode();
        for (int i = 1; i <= n; i++) {
            int value=s.nextInt();
            d1.append(value);

        }
        int position=s.nextInt();
        s.close();
       // System.out.println("Output of linked list");
      //  d1.printList();
        d1.delAtpos(position);
        System.out.println("Output of linked list after deletion");
        d1.printList();
    }

    
}