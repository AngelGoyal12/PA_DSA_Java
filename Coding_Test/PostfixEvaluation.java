
class PostfixEvaluation {
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
            Node n = new Node(x);
            n.next = top;
            top = n;
        }

        int pop() {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    static int evaluate(String exp) {
        Stack s = new Stack();
        String[] tokens = exp.split(" ");

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = s.pop();
                int a = s.pop();
                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else {
                    if (b == 0) {
                        System.out.println("Division by zero not allowed");
                        return 0;
                    }
                    result = a / b;
                }

                s.push(result);
            } else {
                s.push(Integer.parseInt(token));
            }
        }

        return s.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("12 3 4 * + 2 /"));
        System.out.println(evaluate("8 3 -"));
        System.out.println(evaluate("7 2 /"));
    }
}