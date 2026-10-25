package Linked_list;

class Node{
    int val;
    Node next; //iski default value null hai 
    Node(int val){
        this.val= val;
    }
}


public class firstprogram {
    public static void main(String[] args) {
        // 10 20 30 40 50
        Node a = new Node(10); // head node
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40);
        Node e = new Node(50); 
        // coneect karege (link)

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println(e.val);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
    }
    
}
