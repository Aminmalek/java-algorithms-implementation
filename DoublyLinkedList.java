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

    public void insertFirst(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) head.prev = newNode;
        head = newNode;

    }

    public void append(int new_data) {
        Node newNode = new Node(new_data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;

            }
            newNode.prev = temp;
            temp.next = newNode;
        }

    }

    public void insertAfter(Node prev_Node, int new_data) {
        Node temp = head;
        Node newNode = new Node(new_data);
        while (temp.next != prev_Node) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void deleteKey(int key) {
        Node temp = head;
        while (temp.data != key) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
    }

    public void deleteFirst() {
        head.next.prev = null;
        head = head.next;
    }

    public void printListForward() {

        Node temp = head;
        System.out.print("null <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printListBackward() {

        Node temp = head;
        Node last;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("null <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.prev;

        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.append(1);
        dList.append(2);
        dList.append(3);
        dList.append(4);
        dList.append(5);
        //dList.insertAfter(dList.head.next,65);
        //dList.deleteKey(4);
        //dList.deleteFirst();
        dList.printListForward();
        dList.printListBackward();
    }
}
