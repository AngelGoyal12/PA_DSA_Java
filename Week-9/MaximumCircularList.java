public class MaximumCircularList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaximum(Node head) {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int maximum = head.data;
        Node current = head.next;

        while (current != head) {

            if (current.data > maximum) {
                maximum = current.data;
            }

            current = current.next;
        }

        return maximum;
    }

    public static void main(String[] args) {

        Node head = new Node(15);
        head.next = new Node(42);
        head.next.next = new Node(7);
        head.next.next.next = new Node(31);

        head.next.next.next.next = head;

        System.out.println(
                "Maximum: " + findMaximum(head)
        );
    }
}