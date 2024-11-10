// Given the head of a singly linked list, the task is to check if the linked list has a loop. A loop means that the last node of the linked list is connected back to a node in the same list.  So if the next of the last node is null. then there is no loop.

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class DetectLoopInLinkedList {

    static boolean detectLoop(Node head) {
        Set<Node> st = new HashSet<>();

        while (head != null) {
            if (st.contains(head)) {
                return true;
            }
            st.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// The time complexity is O(n) as each node is visited once; the space
// complexity is O(n) for the HashSet storing nodes.