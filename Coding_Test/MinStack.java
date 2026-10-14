
class MinStack {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node top;
    Node minTop;

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        if (minTop == null || x <= minTop.data) {
            Node m = new Node(x);
            m.next = minTop;
            minTop = m;
        }
    }

    Integer pop() {
        if (top == null) {
            return null;
        }

        int value = top.data;
        top = top.next;

        if (value == minTop.data) {
            minTop = minTop.next;
        }
        return value;
    }

    Integer getTop() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    Integer getMin() {
        if (minTop == null) {
            return null;
        }
        return minTop.data;
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(3);
        s.push(7);
        System.out.println(s.getTop());
        System.out.println(s.getMin());

        s.pop();
        s.pop();
        System.out.println(s.getMin());
    }
}