public class DeleteAllOccurrences {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteAll(Node head, int key) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {

                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous = current.previous;
                }
            }

            current = current.next;
        }

        return head;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(10);
        head.next.previous = head;

        head.next.next = new Node(5);
        head.next.next.previous = head.next;

        head.next.next.next = new Node(20);
        head.next.next.next.previous = head.next.next;

        head = deleteAll(head, 5);

        print(head);
    }
}