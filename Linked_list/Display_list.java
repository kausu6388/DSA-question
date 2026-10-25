package Linked_list;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class Display_list {
    public static void Display_list(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(010);
        Node c = new Node(1490);
        Node d = new Node(104);
        Node e = new Node(100);
        Node f = new Node(2010);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Display_list(a);
    }
    
}
