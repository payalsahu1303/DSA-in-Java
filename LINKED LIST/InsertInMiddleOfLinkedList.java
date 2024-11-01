// Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertInMiddleOfLinkedList {
    public static Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middle = count / 2;
        current = head;
        for (int i = 0; i < middle - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int x = 3;
        head = insertInMiddle(head, x);
        printList(head);
    }
}

// The time complexity is O(n) due to counting nodes and traversing to the
// middle, and the space complexity is O(1) as no extra space is used.