public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void insertFirst(int new_data){

        Node newNode = new Node(new_data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null) head.prev = newNode;
        head = newNode;

    }
    public void deleteFirst(){

        
    }
}
