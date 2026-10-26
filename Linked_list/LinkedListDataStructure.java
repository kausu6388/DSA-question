package Linked_list;

class Node{ // user defined data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}


class LinkedList{// user defined data structure
    Node head; // null
    Node tail; //null

    void addArHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }        

    }

    void addArTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }



    void deleteAtHead(int val){
        if (head==null) {
            System.out.println("list is empty");
            return;
            
        }
        head = head.next;
    }



    void display(){
        if(head==null) return ;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addArTail(10);
        ll.addArTail(20);
        ll.addArTail(30);
        ll.addArTail(40);
        ll.display();
        ll.addArHead(90);
        ll.display();
        ll.deleteAtHead(90);
        ll.display();
    }
    
}
