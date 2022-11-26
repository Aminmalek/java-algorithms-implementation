class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        // Adding a new data in first of LinkedList
        // head must be changed and moved forward
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data) {
        // insert after of given Node
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(int new_data) {
        // Add data to the end of LinkedList
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public void deleteFromMiddle(int key) {

        Node temp = head, prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // Unlink the node from linked list
        prev.next = temp.next;

    }

    public void deleteFromHead(int key){
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
        }
    }

    public void reverse(LinkedList list){
        Node prev = null, curr = list.head, next=null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        list.head = prev;

    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("linked list befor oprations: ");
        list.printList();
        //list.deleteFromMiddle(2);
        //list.deleteFromHead(1);
        //System.out.println("\nlinked list after oprations: ");
        //list.printList();
        //list.reverse(list);
        System.out.println("\nlinked list after oprations: ");
        list.printList();
    }
}
