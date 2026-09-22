import java.util.ArrayList;
import java.util.Collections;

public class AddToArrayForm {

    static ArrayList<Integer> add(int[] num, int k) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {

            if (i >= 0) {
                carry += num[i];
                i--;
            }

            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        int[] num = {2, 7, 4};
        int k = 181;

        System.out.println(add(num, k));
    }
}