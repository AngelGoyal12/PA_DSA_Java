import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void generateSubsets(int[] nums, int index,
                                List<Integer> current,
                                List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);

        generateSubsets(nums, index + 1, current, result);

        current.remove(current.size() - 1);

        // Do not include current element
        generateSubsets(nums, index + 1, current, result);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(nums, 0, new ArrayList<>(), result);

        System.out.println("Subsets:");

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}