// Given the two singly Linked Lists respectively. The task is to check whether two linked lists are identical or not. 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IdenticalLinkedLists {
    public static boolean areIdentical(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);

        Node n2 = new Node(1);
        n2.next = new Node(2);
        n2.next.next = new Node(3);
        n2.next.next.next = new Node(4);
        n2.next.next.next.next = new Node(5);

        System.out.println(areIdentical(n1, n2));
    }
}

// The time complexity of `areIdentical()` is O(n), where (n) is the
// length of the shorter list, and the space complexity is O(1) due to
// constant auxiliary space.