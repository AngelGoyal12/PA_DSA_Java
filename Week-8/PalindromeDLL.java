public class PalindromeDLL {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isPalindrome(Node head) {

        if (head == null) {
            return true;
        }

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != right && left.previous != right) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.previous;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.previous = head;

        head.next.next = new Node(2);
        head.next.next.previous = head.next;

        head.next.next.next = new Node(1);
        head.next.next.next.previous = head.next.next;

        System.out.println(
                "Palindrome: " + isPalindrome(head)
        );
    }
}