import java.util.*;
public class CompareLL {
    Node head;
    
   // Node head1;
    static class Node{
        int data;
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
        System.out.println();
    }
    public int compareList(){
        Node iter=head;
        
        int count=0;
        while (iter!=null) {
            count++;
            iter=iter.next;
        }
        return count;
    }
        
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int cnt1,cnt2;
        CompareLL c1=new CompareLL();
        CompareLL c2=new CompareLL();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            c1.append(value);

        }
        int m=s.nextInt();
        for(int i=0;i<m;i++){
            int data=s.nextInt();
            c2.append(data);

        }
        System.out.println("Linked list 1 values");
        c1.printList();
        System.out.println("Linked list 2 values");
        c2.printList();
        cnt1=c1.compareList();
        cnt2=c2.compareList();
        if(cnt1==cnt2){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        s.close();
    }
}
