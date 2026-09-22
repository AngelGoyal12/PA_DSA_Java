public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtEnd(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;

        return head;
    }

    static void printList(Node head) {

        if (head == null) {
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        }
        while (current != head);

        System.out.println();
    }

    static int countNodes(Node head) {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        }
        while (current != head);

        return count;
    }

    static int findMiddle(Node head) {

        if (head == null) {
            return -1;
        }

        int size = countNodes(head);
        int middle = size / 2;

        Node current = head;

        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current.data;
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);

        System.out.println("Circular Linked List:");
        printList(head);

        System.out.println("Number of nodes: "
                + countNodes(head));

        System.out.println("Middle element: "
                + findMiddle(head));
    }
}