// Given a linked list, your task is to complete the function isLengthEven() which contains the head of the linked list, and check whether the length of the linked list is even or not. Return true if it is even, otherwise false.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IsLinkedListLengthEven {

    public static boolean isLengthEven(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(isLengthEven(head));
    }
}

// The time complexity is O(n), as it traverses all nodes once, and the
// space complexity is O(1), using only constant extra space for `count` and
// `head`.