class LinkedList1{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
        
    }
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
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.println(tnode.data);
            tnode=tnode.next;
        }
    }
    public static void main(String args[]){
        LinkedList1 l1=new LinkedList1();
        l1.append(6);
        l1.append(7);
        l1.push(1);
        l1.insertAfter(l1.head.next,8);
        l1.printList();
    }
}