// Implement a singly linked list in Java with nodes that store integer data, and provide a method to print all elements from the head node to the end of the list.

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(5);

        head.next = second;
        second.next = third;
        third.next = null;
        printList(head);
    }

}

// The time complexity of this code is O(n) because `printList` traverses
// all nodes once, while the space complexity is O(1) since only pointers
// are used.