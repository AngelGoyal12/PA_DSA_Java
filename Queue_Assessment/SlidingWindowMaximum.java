import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() &&
                   deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() &&
                   arr[deque.peekLast()] <= arr[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()]);

                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}