import java.util.*;

public class CircularBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int q = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("ADD")) {
                int value = sc.nextInt();

                if (queue.size() == capacity) {
                    System.out.println("FULL");
                } else {
                    queue.addLast(value);
                }
            }
            else if (operation.equals("REMOVE")) {
                if (queue.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue.removeFirst());
                }
            }
            else if (operation.equals("ROTATE")) {
                int k = sc.nextInt();

                if (!queue.isEmpty()) {
                    k = k % queue.size();

                    for (int j = 0; j < k; j++) {
                        int front = queue.removeFirst();
                        queue.addLast(front);
                    }
                }
            }
        }
    }
}