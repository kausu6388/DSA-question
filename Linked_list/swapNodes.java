package Linked_list;

public class swapNodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode fast = head;
        ListNode slow = head;

        // Find kth node from beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Start fast from kth node
        fast = first;

        // Find kth node from end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Swap values
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }

    // Print Linked List
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create Linked List
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);
        head.next.next.next.next.next.next = new ListNode(70);

        int k = 3;

        System.out.println("Before Swapping:");
        printList(head);

        head = swapNodes(head, k);

        System.out.println("After Swapping:");
        printList(head);
    }
}
