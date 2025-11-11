public class reverseLinkedList {
    static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    node reverseList(node head) {
        node prev = null;
        node current = head;
        node next = null;
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;      
            current = next;
        }
        return prev; 
    }
    
}
