// Given a linked list. Print all the elements of the linked list separated by space followed.

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PrintLinkedListElements {
  
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        printList(head); 
    }
}

// The time complexity is O(n) since it traverses all nodes, and the space complexity is O(1) because no additional space is used aside from pointers.