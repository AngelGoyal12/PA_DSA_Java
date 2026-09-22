public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node delete(Node head, int value) {

        if (head == null) {
            return null;
        }

        // If the only node is being deleted
        if (head.next == head && head.data == value) {
            return null;
        }

        // Delete head node
        if (head.data == value) {

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;

            return head;
        }

        Node current = head;

        while (current.next != head) {

            if (current.next.data == value) {
                current.next = current.next.next;
                return head;
            }

            current = current.next;
        }

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

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = delete(head, 30);

        printList(head);
    }
}