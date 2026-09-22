public class JosephusProblem {

    static int josephus(int n, int k) {

        if (n == 1) {
            return 0;
        }

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {

        int n = 7;
        int k = 3;

        int survivor = josephus(n, k);

        System.out.println(
                "Survivor position: " + (survivor + 1)
        );
    }
}