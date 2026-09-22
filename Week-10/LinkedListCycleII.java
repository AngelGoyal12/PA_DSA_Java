public class LinkedListCycleII {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                Node start = head;

                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }

                return start;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        head.next.next.next.next = head.next;

        Node cycleStart = detectCycle(head);

        if (cycleStart != null) {
            System.out.println(
                    "Cycle starts at: " + cycleStart.data
            );
        }
        else {
            System.out.println("No cycle.");
        }
    }
}