// Given the head of a Singly Linked List and a number k, the task is to find the modular node of the linked list. If no such index is present return -1.
// A modular node is defined as the last node in the linked list whose index is divisible by k (i%k==0). 

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class ModularNode {

  public static int modularNode(Node head, int k) {
    int index = -1;
    int i = 1;
    while (head != null) {
      if (head.data % k == 0) {
        index = head.data;
      }
      head = head.next;
      i++;
    }
    return index;
  }

  public static void main(String[] args) {
    Node head = new Node(2);
    head.next = new Node(4);
    head.next.next = new Node(5);
    head.next.next.next = new Node(7);
    int k = 2;
    int result = modularNode(head, k);
    System.out.println("Modular node data: " + result);
  }
}

// The code has a time complexity of O(n), iterating through the array once. The space complexity is O(1), using minimal auxiliary spaceThe time complexity is **O(n) because it iterates through each node once. The space complexity is O(1) since it only uses a constant amount of extra space for variables.
