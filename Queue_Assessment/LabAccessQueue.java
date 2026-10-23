import java.util.*;

public class LabAccessQueue {
    static class Request {
        String id;
        int priority;
        int order;
        Request(String id, int priority, int order) {
            this.id = id;
            this.priority = priority;
            this.order = order;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        PriorityQueue<Request> queue = new PriorityQueue<>(
            (a, b) -> {
                if (a.priority != b.priority) {
                    return Integer.compare(a.priority, b.priority);
                }
                return Integer.compare(a.order, b.order);
            }
        );

        int order = 0;

        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("REQUEST")) {
                String id = sc.next();
                int priority = sc.nextInt();
                queue.add(new Request(id, priority, order));
                order++;
            }
            else if (operation.equals("NEXT")) {
                if (queue.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue.poll().id);
                }
            }
        }
    }
}