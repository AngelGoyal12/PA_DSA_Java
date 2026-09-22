public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    static int countNodes(Node head) {

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    static boolean search(Node head, int target) {

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    static int findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    static Node reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node nextNode = current.next;

            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Linked List:");
        printList(head);

        System.out.println("Number of nodes: " + countNodes(head));
        System.out.println("Search 30: " + search(head, 30));
        System.out.println("Middle node: " + findMiddle(head));

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}