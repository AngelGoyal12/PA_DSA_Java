import java.util.*;

public class ServiceDeskQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("JOIN")) {
                int ticket = sc.nextInt();
                queue.add(ticket);
            }
            else if (operation.equals("SERVE")) {
                if (queue.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue.poll());
                }
            }
            else if (operation.equals("CANCEL")) {
                int ticket = sc.nextInt();
                queue.remove(ticket);
            }}}}