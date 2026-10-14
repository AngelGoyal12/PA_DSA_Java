
class ReverseKGroups {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static Node reverseKGroup(Node head,int k) {
        if(head == null || k <= 1) {
            return head;
        }

        Node temp = head;
        int count = 0;
        while(temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count < k) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;
        count = 0;
        while(curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr,k);
        return prev;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        head = reverseKGroup(head,3);
        printList(head);
    }
}