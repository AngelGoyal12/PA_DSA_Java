public class FirstLastPosition {

    static int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    static int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println("[" +
                findFirst(nums, target) + ", " +
                findLast(nums, target) + "]");
    }
}