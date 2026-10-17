class Solution {
    public int minCostClimbingStairs(int[] cost) {
      int d[]=new int[cost.length+2];
      for(int i=cost.length-1;i>=0;i--){
        d[i]=Math.min(cost[i]+d[i+2],cost[i]+d[i+1]);
      }    
      return Math.min(d[0],d[1]);
    }
}