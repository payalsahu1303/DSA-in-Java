// Given the head of a linked list and the number k, Your task is to find the kth node from the end. If k is more than the number of nodes, then the output should be -1.

class Node {
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class KthFromEndOfLinkedList {
  
  static int getKthFromLast(Node head, int k) {
    if (head == null || k <= 0){
      return -1;
    } 
    
    Node current = head;
    int count = 0;
    
    while(current != null){
      count++;
      current = current.next;
    }
    
    if (k > count) {
      return -1;
    }
    
    current = head;
    
    for(int i = 1; i < count - k + 1; i++){
      current = current.next;
    }
    
    return current.data;
    
  }
    
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    
    int k = 3;
    
    System.out.println(getKthFromLast(head, k));
  
  }
}

// The time complexity is O(n) due to traversing the linked list twice. Space complexity is O(1) since no additional space is used beyond variables.