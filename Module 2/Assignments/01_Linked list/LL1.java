import java.util.*;;
public class LL1 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
    public void insertAtpos(int pos,int data){
        int count=-1;
        Node iter=head;
        while (iter!=null) {
            count++;
            iter=iter.next;
        }
        if(pos<0 || pos>count+1){
            System.out.println("Invalid position...");
            return;
        }
        Node new_node=new Node(data);
        if(pos==0 && head==null){
            head=new_node;
            return;
        }
        if(pos==0 ){
            new_node.next=head;
            head=new_node;
            return;
        }

        iter=head;
        Node prev=head;;
        int i=0;
        while (i<pos) {
            prev=iter;
            iter=iter.next;
            i++;
        }
        prev.next=new_node;
        new_node.next=iter;
        


    }
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }
    public void delAtMid(){
        //System.out.println("Hii");
        if(head==null){
            System.out.println("There is nothing to delete");
        }
            int count=0;
            Node iter=head;
            if(head.next==null){
                head=null;
                return;
            }
            while (iter!=null) {
                count++;
                iter=iter.next;
            }
            //System.out.println("Count :"+count);
            int mid=0;
            mid=count/2;
            mid=mid+1;          
            iter=head;
            Node prev=head;
            int i=1;
            while (i<mid) {
                prev=iter;
                iter=iter.next;
                i++;
            }
            prev.next=iter.next;
            

        
    }
    public static  void main(String arg[]) {
        LL1 l1=new LL1();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int data;
        for (int i = 0; i < n; i++) {
            data=s.nextInt();
            l1.append(data);
        }
        System.out.println("List values...");
        l1.printList();
        data=s.nextInt();
        int pos=s.nextInt();
        l1.insertAtpos(pos, data);
        s.close();

        //l1.delAtMid();
        //System.out.println("After delete at middle");
        System.out.println("List values after insert at position...");
        l1.printList();

    }
}
