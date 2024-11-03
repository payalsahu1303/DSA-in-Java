// Given the head of a linked list, the task is to find the middle. For example, the middle of 1-> 2->3->4->5 is 3. If there are two middle nodes (even count), return the second middle. For example, middle of 1->2->3->4->5->6 is 4.

class Node {
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class MiddleOfLinkedList {
  
  static int getMiddle(Node head) {
    
    Node current = head;
    int count = 0;
    
    while(current != null){
      count++;
      current = current.next;
    }
    int mid = count/2;
    current = head;
    if(mid % 2 != 0){
      for(int i = 1; i < mid; i++){
        current = current.next;
      }
    } else {
      for(int i = 1; i < mid+1; i++){
        current = current.next;
      }
    }
    return current.data;
    
  }
    
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    
    System.out.println(getMiddle(head));
  
  }
}

// The time complexity is O(n) due to traversing the linked list twice. The space complexity is O(1) since it only uses constant extra space.
