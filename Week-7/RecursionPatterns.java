public class RecursionPatterns {

    // Fibonacci using recursion
    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Head recursion
    static void headRecursion(int n) {

        if (n == 0) {
            return;
        }

        headRecursion(n - 1);

        System.out.print(n + " ");
    }

    // Tail recursion
    static void tailRecursion(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        tailRecursion(n - 1);
    }

    // Print all substrings
    static void printSubstrings(String s) {

        for (int i = 0; i < s.length(); i++) {

            String current = "";

            for (int j = i; j < s.length(); j++) {

                current += s.charAt(j);

                System.out.println(current);
            }
        }
    }

    // Print all subsequences
    static void printSubsequences(String s, int index, String current) {

        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Include character
        printSubsequences(
                s,
                index + 1,
                current + s.charAt(index)
        );

        // Exclude character
        printSubsequences(
                s,
                index + 1,
                current
        );
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci:");
        System.out.println(fibonacci(6));

        System.out.println();

        System.out.println("Head recursion:");
        headRecursion(5);

        System.out.println();

        System.out.println("Tail recursion:");
        tailRecursion(5);

        System.out.println("\n");

        System.out.println("Substrings of ABC:");
        printSubstrings("ABC");

        System.out.println();

        System.out.println("Subsequences of ABC:");
        printSubsequences("ABC", 0, "");
    }
}