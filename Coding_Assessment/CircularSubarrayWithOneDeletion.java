import java.util.*;

public class CircularSubarrayWithOneDeletion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }

        long[] arr = new long[2 * n];
        for(int i = 0; i < 2 * n; i++){
            arr[i] = nums[i % n];
        }

        long answer = Long.MIN_VALUE;
        for(int start = 0; start < n; start++){
            long sum = 0;
            long minValue = Long.MAX_VALUE;
            int length = Math.min(n, 2 * n - start);

            for(int j = start; j < start + length; j++){
                sum += arr[j];
                answer = Math.max(answer, sum);
                if(sum > minValue){
                    minValue = sum;
                }
            }
        }

        long keep = nums[0];
        long delete = Long.MIN_VALUE / 2;
        long best = nums[0];

        for(int i = 1; i < n; i++){
            long newDelete = Math.max(delete + nums[i], keep);
            keep = Math.max(nums[i], keep + nums[i]);
            delete = newDelete;
            best = Math.max(best, Math.max(keep, delete));
        }
        System.out.println(Math.max(answer, best));
    }
}