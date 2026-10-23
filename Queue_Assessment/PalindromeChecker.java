import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(ch);
            }
        }

        boolean palindrome = true;

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }
}