package Linked_list;

class Node{
    int val;
    Node next;
}


public class firstprogram {
    public static void main(String[] args) {
        // 10 20 30 40 50
        Node a = new Node(); a.val = 10;
        Node b = new Node(); b.val = 20;
        Node c = new Node(); c.val = 30;
        Node d = new Node(); d.val = 40;
        Node e = new Node(); e.val = 50;
        // coneect karege (link)

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }
    
}
