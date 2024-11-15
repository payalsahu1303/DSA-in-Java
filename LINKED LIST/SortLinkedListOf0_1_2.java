// Given a linked list where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to the head side, 2s at the end of the linked list, and 1s in the middle of 0s and 2s.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SortLinkedListOf0_1_2 {

    public static Node segregate(Node head) {
        int[] count = { 0, 0, 0 };
        Node current = head;

        while (current != null) {
            count[current.data]++;
            current = current.next;
        }

        current = head;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0) {
                current.data = i;
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        head = segregate(head);
        printList(head);
    }
}

// The time complexity of the code is O(n) for traversing the list twice,
// and the space complexity is O(1) as no extra space is used.