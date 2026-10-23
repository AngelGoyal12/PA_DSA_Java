import java.util.*;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("ENQUEUE")) {
                int value = sc.nextInt();
                stack1.push(value);
            }
            else if (operation.equals("DEQUEUE") || operation.equals("FRONT")) {
                if (stack2.isEmpty()) {
                    while(!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                if (stack2.isEmpty()) {
                    System.out.println("EMPTY");
                }
                else if (operation.equals("DEQUEUE")) {
                    System.out.println(stack2.pop());
                }
                else {
                    System.out.println(stack2.peek());
                }
            }
        }
    }
}