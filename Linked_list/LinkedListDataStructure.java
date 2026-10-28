package Linked_list;

class Node{ // user defined data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}


class LinkedList{// user defined data structure
    int size;
    Node head; // null
    Node tail; //null

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }  
        size++;      

    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }



    void deleteAtHead(int val){
        if (head==null) {
            System.out.println("list is empty");
            return;
            
        }
        head = head.next;
        if(head==null) tail = null;
        size --;
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
    int get (int idx){
        Node temp = head;
        for(int i = 1 ; i<=idx ; i++){
            temp = temp.next;
        }
        return temp.val;


    }
   
    void insert(int val , int idx){
        if(idx<0 ||idx>size)System.out.println("invalid idx");
                              
           
        
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp =  head;
            for(int i = 1 ; i<idx;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void delete(int idx){
        Node temp = head;
        for(int i = 1 ; i<=idx-1;i++){
            temp = temp.next;


        }
        temp.next = temp.next.next; //thir is actually deleting the element
        if(idx==size - 1) tail = temp;  // we are deleting tail
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(90);
        ll.display();
        ll.deleteAtHead(90);
        ll.display();
        // System.out.println(ll.size);
        ll.insert(46, 2 );ll.display();
        System.out.println(ll.get(3));
        ll.delete(4);

    }
    
}
