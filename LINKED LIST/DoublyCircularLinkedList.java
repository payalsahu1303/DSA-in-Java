// Implement a doubly circular linked list in Java that supports both forward and backward traversal, starting from a given head node.

class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
        this.next = this;
        this.previous = this;
    }
}

public class DoublyCircularLinkedList {
    static void forward(Node head) {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }

    static void backward(Node head) {
        Node current = head.previous;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.previous;
            } while (current.next != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node second = new Node(6);
        Node third = new Node(9);
        Node forth = new Node(12);

        head.next = second;
        second.previous = head;
        second.next = third;
        third.next = forth;
        third.previous = second;
        forth.next = head;
        forth.previous = third;
        head.previous = forth;

        System.out.print("Forward Traversing : ");
        forward(head);
        System.out.print("\nBackward Traversing : ");
        backward(head);

    }
}

// The time complexity of both `forward` and `backward` traversal functions
// is O(n), as they each visit every node once, where n is the number
// of nodes. The space complexity is O(1), as only constant extra space
// is used for traversal, regardless of the number of nodes.