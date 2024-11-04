// Given the head of a linked list, the task is to reverse this list and return the reversed head.

class Node {
    int data;
    Node previous;
    Node next;
    Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void reverse(Node tail) {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
    }
    
    public static void main(String[] args) {
        Node tail = new Node(4);
        tail.previous = new Node(3);
        tail.previous.previous = new Node(2);
        tail.previous.previous.previous = new Node(1);
        System.out.print("Reversed Linked List : ");
        reverse(tail);
    }
}

// The time complexity is O(n) as it traverses each node once, and the space complexity is O(1) since no extra space is used, only pointers are manipulated.