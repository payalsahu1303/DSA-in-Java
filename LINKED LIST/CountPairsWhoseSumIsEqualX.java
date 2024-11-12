// Given two linked lists head1 and head2 with distinct elements, determine the count of all distinct pairs from both lists whose sum equals the given value x.

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class CountPairsWhoseSumIsEqualX {
    public static int countPairs(Node head1, Node head2, int x) {
        // Create a set to store the elements from the first list
        Set<Integer> set1 = new HashSet<>();
        Node temp = head1;
        while (temp != null) {
            set1.add(temp.data);
            temp = temp.next;
        }
        // Create a set to store the elements from the second list
        Set<Integer> set2 = new HashSet<>();
        temp = head2;
        while (temp != null) {
            set2.add(temp.data);
            temp = temp.next;
        }
        int count = 0;
        // Iterate over the first set
        for (int num : set1) {
            // Check if the difference between x and the current number exists in the second set
            if (set2.contains(x - num)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        // Create two linked lists
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        int x = 7;
        System.out.println("Count of pairs whose sum is equal to " + x + " is " + countPairs(head1, head2, x));
    }
}

// Time Complexity is O(m + n), where m and n are the lengths of the two lists, due to inserting and checking elements in HashSets. Space Complexity is O(m + n) for storing elements in two HashSets.