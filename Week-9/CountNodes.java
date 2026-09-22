public class CountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int count(Node head) {

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

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        head.next.next.next.next = head;

        System.out.println("Total nodes: " + count(head));
    }
}