public class VariableSlidingWindow {

    static int longestSubarray(int[] arr, int limit) {

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > limit && left <= right) {
                sum -= arr[left];
                left++;
            }

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 2, 1, 1};
        int limit = 6;

        System.out.println("Longest valid subarray: "
                + longestSubarray(arr, limit));
    }
}