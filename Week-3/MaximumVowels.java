public class MaximumVowels {

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    static int maxVowels(String s, int k) {

        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println("Maximum vowels: " + maxVowels(s, k));
    }
}