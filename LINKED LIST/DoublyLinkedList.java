// Design and implement a doubly linked list in Java with nodes capable of bidirectional traversal, allowing forward traversal from the head and backward traversal from the tail.

class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class DoublyLinkedList {
    public static void forward(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void backward(Node tail) {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(5);
        Node third = new Node(10);
        Node tail = new Node(15);

        head.next = second;
        second.previous = head;
        second.next = third;
        third.previous = second;
        third.next = tail;
        tail.previous = third;

        System.out.print("Forward Traversing : ");
        forward(head);
        System.out.print("\nBackward Traversing : ");
        backward(tail);
    }
}

// The time complexity for both `forward` and `backward` traversals is O(n),
// and the space complexity is O(1) as only pointers and basic data are
// stored.