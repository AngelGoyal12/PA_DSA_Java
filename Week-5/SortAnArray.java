import java.util.Arrays;

public class SortAnArray {

    static int[] sortArray(int[] nums) {

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        int[] result = sortArray(nums);

        System.out.println(Arrays.toString(result));
    }
}