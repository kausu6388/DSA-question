package Linked_list;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class remove {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.next != null &&
                curr.val == curr.next.val) {

                int duplicate = curr.val;

                while (curr != null &&
                       curr.val == duplicate) {
                    curr = curr.next;
                }

                prev.next = curr;

            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3,
                new ListNode(4,
                new ListNode(4,
                new ListNode(5)))))));

        ListNode result = deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
