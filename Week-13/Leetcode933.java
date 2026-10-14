// [t-3000, t]
// ping(1)        ->         [-2999, 1]              -> 1
// ping(100)      ->         [-2900, 100]            -> 2
// ping(3001)     ->         [1, 3001]               -> 3
// ping(3002)     ->         [2, 3002]               -> 3

class RecentCounter {
    Queue<Integer>q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek() < t - 3000){
            q.poll();
        }
        return q.size();
    }
}