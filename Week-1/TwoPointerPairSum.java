public class TwoPointerPairSum {

    static void findPairs(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);

                found = true;
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8, 10};
        int target = 10;

        findPairs(arr, target);
    }
}