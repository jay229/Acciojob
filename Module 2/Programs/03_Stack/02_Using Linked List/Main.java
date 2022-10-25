import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Stack{    
    Node top;
    public void push(int data) {
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;

    }
    public int pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    public void display() {
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        Node iter=top;
        while (iter!=null) {
            System.out.print(iter.data+"-->");
            iter=iter.next;
        }
        System.out.println();
    }
    public int peek() {
        if(top==null){
            System.out.println("Stack underflow");
            return -1;
        }
        int value=top.data;
        return value;
    }

}
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Stack st=new Stack();
        for (int i = 0; i < n; i++) {
            int data=s.nextInt();
            st.push(data);
        }
        st.display();
        System.out.println(st.peek());
    }
    
}