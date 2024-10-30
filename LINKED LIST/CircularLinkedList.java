// Implement a circular linked list in Java, where each node points to the next node in sequence, and the last node links back to the first node, creating a circular structure, and include a method to print all elements starting from any given node.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static void printList(Node last) {
        if (last == null) {
            return;
        }
        Node head = last.next;
        while (true) {
            System.out.print(head.data + " ");
            head = head.next;
            if (head == last.next) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(6);
        Node last = first.next.next;
        last.next = first;
        System.out.print("Circular Linked List : ");
        printList(last);
    }
}

// The time complexity of this code is O(n) as it iterates through all nodes
// in the circular linked list, and the space complexity is O(1) since it
// uses a constant amount of extra memory.