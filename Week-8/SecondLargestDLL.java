public class SecondLargestDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int findSecondLargest(Node head) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        Node current = head;

        while (current != null) {

            if (current.data > largest) {
                secondLargest = largest;
                largest = current.data;
            }
            else if (current.data > secondLargest
                    && current.data != largest) {

                secondLargest = current.data;
            }

            current = current.next;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Node head = new Node(40);

        head.next = new Node(15);
        head.next.previous = head;

        head.next.next = new Node(70);
        head.next.next.previous = head.next;

        head.next.next.next = new Node(25);
        head.next.next.next.previous = head.next.next;

        System.out.println(
                "Second largest: " + findSecondLargest(head)
        );
    }
}