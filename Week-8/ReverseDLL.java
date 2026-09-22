public class ReverseDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {

        Node current = head;
        Node newHead = null;

        while (current != null) {

            Node nextNode = current.next;

            current.next = current.previous;
            current.previous = nextNode;

            newHead = current;

            current = nextNode;
        }

        return newHead;
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

        head = reverse(head);

        print(head);
    }
}