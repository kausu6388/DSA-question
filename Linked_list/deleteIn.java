package Linked_list;
class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        a.next = new ListNode(5);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(9);

        ListNode target = a.next;

        target.val = target.next.val;
        target.next = target.next.next;

        while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
}
