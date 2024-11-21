package DataStructure.Linear.LinkedLists.SinglyLinkedList;

// Definition for the ListNode class
class ListNode {
    int val;
    ListNode next;

    // Constructor for ListNode
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class Q1_Reverse_linkedList {

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.println("Original Linked List:");
        printList(head);
        // Reverse the list
        ListNode reversedHead = reverseList(head);
        // Print the reversed list
        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }

    // Method to reverse a linked list
    public static ListNode reverseList(ListNode head) {
        ListNode current = head; // Pointer to traverse the list
        ListNode previous = null; // Pointer to the previous node
        ListNode next = null; // Temporary pointer to store the next node

        while (current != null) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the current node's next pointer
            previous = current; // Move the previous pointer forward
            current = next; // Move the current pointer forward
        }
        return previous;
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}