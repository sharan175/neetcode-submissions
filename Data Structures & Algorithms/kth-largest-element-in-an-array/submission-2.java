class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new  PriorityQueue<>();
        for(int a:nums){
            if(q.size()<k){
                q.offer(a);
            }
            else if(q.size()==k && q.peek()<a){
                q.poll();
                q.offer(a);
            }
        }
        return q.peek();
    }
}
