// Given a linked list sorted in ascending order and an integer called x, insert data in the linked list such that the list remains sorted.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertInSortedList {
    Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null || head.data >= x) {
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        InsertInSortedList list = new InsertInSortedList();
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head = list.sortedInsert(head, 2);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

// The time complexity of this code is O(n) for traversing the list, and the
// space complexity is O(1) since no additional data structures are used.