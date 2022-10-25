import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LL {
    Node head;

    // Append the node
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    // Insert k integer at beginning
    public void insertBefore(int k) {
        Node newnode = new Node(k);
        if (head == null) {
            head = newnode;
            return;
        }
        head.prev = newnode;
        newnode.next = head;
        head = newnode;
    }

    // Insert at specified position
    public void insertAtPos(int data, int position) {
        Node iter = head;
        int length = 0;
        while (iter != null) {
            length++;
            iter = iter.next;
        }
        if (position <= 0 || position > length + 1) {
            System.out.println("Invalid Position...");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1 && head == null) {
            head = newNode;
            return;
        }
        Node p = null;
        Node cur = head;
        int i = 1;
        while (i < position) {
            p = cur;
            cur = cur.next;
            i++;

        }
        p.next = newNode;
        newNode.prev = p;
        newNode.next = cur;
    }

    // Remove last node
    public void DeleteAtEnd() {
        if (head == null) {
            System.out.println("Nothing to remove");
            return;
        }
        Node iter = head;
        while (iter.next != null) {
            iter = iter.next;
        }
        iter.prev.next = null;
        iter.prev = null;

    }

    // Remove first node
    public void DeleteAtBeg() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    // Remove node from specified position
    public void DeleteAtPos(int position) {
        if (position <= 0) {
            System.out.println("Invalid Position...");
            return;
        }
        Node iter = head;
        int length = 0;
        while (iter != null) {
            length++;
            iter = iter.next;
        }
        if (position > length) {
            System.out.println("Invalid Position...");
            return;
        }

        if (position == 1) {
            this.DeleteAtBeg();
            return;
        }
        if (position == length) {
            this.DeleteAtEnd();
            return;
        }
        Node p = null;
        Node cur = head;
        int i = 1;
        while (i < position) {
            p = cur;
            cur = cur.next;
            i++;

        }
        p.next = cur.next;
        cur.next.prev = p;
    }

    // Print the list in farward direction
    public void printList() {
        if (head == null) {
            System.out.println("Nothing to Display...");
            return;
        }
        Node iter = head;
        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
        System.out.println();

    }

}

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l1 = new LL();
        System.out.print("Enter the length of list :");
        int n = sc.nextInt();
        int data;
        for (int i = 0; i < n; i++) {
            data = sc.nextInt();
            l1.append(data);
        }
        System.out.println("Values of the list...");
        l1.printList();
        // l1.insertBefore(6);
        // l1.insertAtPos(6, 3);
        // l1.DeleteAtEnd();
        // l1.DeleteAtBeg();
        l1.DeleteAtPos(5);
        l1.printList();
        sc.close();
    }

}