import java.util.*;;
public class RevLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void append(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node newnode=new Node(data);
        Node last=head;
        while (last.next!=null) {
            last=last.next;
        }
        last.next=newnode;
    }
    void revL(){
        Node cur=head;
        Node prev=null;
        if(head.next==null)
            return;
        while (cur!=null) {
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        head=prev;
    }
    Node revLrec(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node newhead=revLrec(head.next);
        Node hn=head.next;
        hn.next=head;
        head.next=null;
        return newhead;
    }
    void printList(){
        if(head==null){
            System.out.print("LL is empty...");
            return;
        }
        Node iter=head;
        while (iter!=null) {
            System.out.print(iter.data+" ");
            iter=iter.next;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        RevLL d1=new RevLL();
        for (int i = 1; i <= n; i++) {
            int value=s.nextInt();
            d1.append(value);

        }
        d1.printList();
        //d1.revL();
        d1.head=d1.revLrec(d1.head);
        System.out.println("\n After reversing the list...");
        d1.printList();
        s.close();
    }
}
