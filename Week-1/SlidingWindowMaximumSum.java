public class SlidingWindowMaximumSum {

    static int findMaxSum(int[] arr, int k) {

        if (k <= 0 || k > arr.length) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int answer = findMaxSum(arr, k);

        System.out.println("Maximum sum: " + answer);
    }
}