public class MinimumSubarrayLength {

    static int findMinimum(int[] arr, int target) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum >= target) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum -= arr[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println("Minimum length: "
                + findMinimum(arr, target));
    }
}