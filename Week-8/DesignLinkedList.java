public class DesignLinkedList {

    static class MyLinkedList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node head;

        void addAtHead(int value) {

            Node newNode = new Node(value);

            newNode.next = head;
            head = newNode;
        }

        void addAtTail(int value) {

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        int get(int index) {

            Node current = head;

            for (int i = 0; i < index; i++) {

                if (current == null) {
                    return -1;
                }

                current = current.next;
            }

            if (current == null) {
                return -1;
            }

            return current.data;
        }

        void addAtIndex(int index, int value) {

            if (index == 0) {
                addAtHead(value);
                return;
            }

            Node current = head;

            for (int i = 0; i < index - 1; i++) {

                if (current == null) {
                    return;
                }

                current = current.next;
            }

            if (current == null) {
                return;
            }

            Node newNode = new Node(value);

            newNode.next = current.next;
            current.next = newNode;
        }

        void deleteAtIndex(int index) {

            if (head == null) {
                return;
            }

            if (index == 0) {
                head = head.next;
                return;
            }

            Node current = head;

            for (int i = 0; i < index - 1; i++) {

                if (current.next == null) {
                    return;
                }

                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        void printList() {

            Node current = head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.addAtHead(20);
        list.addAtHead(10);
        list.addAtTail(30);
        list.addAtIndex(2, 25);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Element at index 2: " + list.get(2));

        list.deleteAtIndex(1);

        System.out.println("After deletion:");
        list.printList();
    }
}