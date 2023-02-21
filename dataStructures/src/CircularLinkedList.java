public class CircularSinglyLinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void deleteFirst() {
        head = head.next;
        tail.next = head;
    }

    public void printList() {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
        }

        while (node != tail) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cList = new CircularSinglyLinkedList();
        cList.append(1);
        cList.append(2);
        cList.append(3);
        cList.deleteFirst();
        cList.printList();
    }
}
