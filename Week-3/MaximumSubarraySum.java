public class MaximumSubarraySum {

    static int maxSum(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 7, 8, 1, 2};
        int k = 3;

        System.out.println("Maximum sum: " + maxSum(arr, k));
    }
}