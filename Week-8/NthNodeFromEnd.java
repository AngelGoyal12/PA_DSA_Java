public class NthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int findNthFromEnd(Node head, int n) {

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {

            if (first == null) {
                return -1;
            }

            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        System.out.println(
                n + "nd node from end: "
                        + findNthFromEnd(head, n)
        );
    }
}