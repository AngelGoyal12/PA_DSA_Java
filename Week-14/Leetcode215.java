class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Logic:
        // k = 2
        // numbers = 3 2 1 5 6 4
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}