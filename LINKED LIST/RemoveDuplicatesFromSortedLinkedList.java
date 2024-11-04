// Given a singly linked list. The task is to remove duplicates (nodes with duplicate values) from the given list (if it exists).

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedLinkedList {
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head = removeDuplicates(head);
        printList(head);
    }
}

// The time complexity is O(n^2) due to nested loops, and the space complexity
// is O(1), as it uses only constant extra space.