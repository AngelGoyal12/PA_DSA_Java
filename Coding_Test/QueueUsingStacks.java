class QueueUsingStacks {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }

    static class Stack {
        Node top;

        void push(int x) {
            Node newNode = new Node(x);
            newNode.next=top;
            top=newNode;
        }

        Integer pop() {
            if (top == null) {
                return null;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    Stack Stack1 = new Stack();
    Stack stack2 = new Stack();

    void enqueue(int x) {
        Stack1.push(x);
    }

    private void transfer() {
        if (stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                stack2.push(Stack1.pop());
            }
        }
    }

    Integer dequeue() {
        transfer();
        return stack2.pop();
    }

    Integer peek() {
        transfer();
        if (stack2.isEmpty()) {
            return null;
        }
        return stack2.top.data;
    }

    boolean isEmpty() {
        return Stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front: "+q.peek());
        System.out.println("Removed: "+q.dequeue());
        System.out.println("Removed: "+q.dequeue());

        q.enqueue(40);
        System.out.println("Front: "+q.peek());
        System.out.println("Removed: "+q.dequeue());
        System.out.println("Removed: "+q.dequeue());

        System.out.println("Empty: "+q.isEmpty());
        System.out.println("Dequeue on empty: "+q.dequeue());
    }
}