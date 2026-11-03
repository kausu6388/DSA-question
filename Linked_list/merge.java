package Linked_list;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class merge {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode i = l1;
        ListNode j = l2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if (i == null) {
            k.next = j;
        } else {
            k.next = i;
        }

        return dummy.next;
    }

    // Array se linked list banane ka method
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Linked list print karne ka method
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode l1 = createList(new int[]{1, 3, 5});
        ListNode l2 = createList(new int[]{2, 4, 6});

        ListNode result = mergeTwoLists(l1, l2);

        printList(result);
    }
}

