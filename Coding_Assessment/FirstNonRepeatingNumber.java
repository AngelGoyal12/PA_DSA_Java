import java.util.*;

public class FirstNonRepeatingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }

        Queue<Integer> q = new LinkedList<>();
        HashMap<Long, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++){
            q.add(i);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if(i >= k){
                long removed = nums[i - k];
                freq.put(removed, freq.get(removed) - 1);
            }
            while(!q.isEmpty()){
                int index = q.peek();
                if(index <= i - k){
                    q.poll();
                } 
                else if(freq.get(nums[index]) != 1){
                    q.poll();
                } 
                else {break;}
            }

            if(i >= k - 1){
                if(q.isEmpty()){
                    System.out.print(-1);
                } 
                else{
                    System.out.print(nums[q.peek()]);
                }

                if(i < n - 1){
                    System.out.print(" ");
                }
            }
        }
    }
}