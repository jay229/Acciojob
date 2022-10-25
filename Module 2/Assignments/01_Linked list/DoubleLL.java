import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void insertBefore(int k) {
        Node newnode = new Node(k);
        if (head == null) {
            return;
        }
        head.prev = newnode;
        newnode.next = head;
        head = newnode;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            head.prev = null;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;

    }

    void printList() {
        if (head == null)
            return;
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class DoubleLL {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner s = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = s.nextInt();
        int k = s.nextInt();
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            l1.add(value);
        }
        s.close();
        l1.insertBefore(k);
        l1.printList();
    }
}