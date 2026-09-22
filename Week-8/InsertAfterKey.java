public class InsertAfterKey {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void insertAfter(Node head, int key, int value) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {

                Node newNode = new Node(value);

                newNode.next = current.next;
                newNode.previous = current;

                if (current.next != null) {
                    current.next.previous = newNode;
                }

                current.next = newNode;

                return;
            }

            current = current.next;
        }
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.previous = head;

        head.next.next = new Node(30);
        head.next.next.previous = head.next;

        insertAfter(head, 20, 25);

        print(head);
    }
}