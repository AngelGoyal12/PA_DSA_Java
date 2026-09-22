import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    static String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index,
                         String current,
                         List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int number = digits.charAt(index) - '0';

        String letters = phone[number];

        for (int i = 0; i < letters.length(); i++) {

            generate(
                    digits,
                    index + 1,
                    current + letters.charAt(i),
                    result
            );
        }
    }

    static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        generate(digits, 0, "", result);

        return result;
    }

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(letterCombinations(digits));
    }
}