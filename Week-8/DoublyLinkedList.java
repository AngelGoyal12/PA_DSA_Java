public class DoublyLinkedList {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtEnd(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.previous = current;

        return head;
    }

    static void printForward(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    static void printBackward(Node head) {

        if (head == null) {
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        System.out.println("Forward:");
        printForward(head);

        System.out.println("Backward:");
        printBackward(head);
    }
}