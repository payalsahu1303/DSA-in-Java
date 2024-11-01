// Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertionAtEnd {
    static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("Original List : ");
        printList(head);
        head = insertAtEnd(head, 4);
        System.out.print("Modified List : ");
        printList(head);
    }

}